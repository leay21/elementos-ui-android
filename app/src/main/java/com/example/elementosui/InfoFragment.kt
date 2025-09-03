package com.example.elementosui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.elementosui.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!
    private val handler = Handler(Looper.getMainLooper())
    private var progress = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TextView interactivo
        binding.textViewInteractive.setOnClickListener {
            Toast.makeText(requireContext(),
                "TextView clickeado!", Toast.LENGTH_SHORT).show()
        }

        // ImageView interactivo
        binding.imageView.setOnClickListener {
            val currentAlpha = binding.imageView.alpha
            binding.imageView.alpha = if (currentAlpha == 1.0f) 0.5f else 1.0f
            Toast.makeText(requireContext(),
                "Imagen ${if (currentAlpha == 1.0f) "atenuada" else "normal"}",
                Toast.LENGTH_SHORT).show()
        }

        // ProgressBar
        binding.btnStartProgress.setOnClickListener {
            startProgress()
        }

        binding.btnResetProgress.setOnClickListener {
            resetProgress()
        }
    }

    private fun startProgress() {
        progress = 0
        binding.progressBarHorizontal.progress = 0
        binding.progressBarCircular.visibility = View.VISIBLE

        val progressRunnable = object : Runnable {
            override fun run() {
                if (progress < 100) {
                    progress += 5
                    binding.progressBarHorizontal.progress = progress
                    binding.tvProgress.text = "Progreso: $progress%"
                    handler.postDelayed(this, 200)
                } else {
                    binding.progressBarCircular.visibility = View.GONE
                    Toast.makeText(requireContext(),
                        "¡Progreso completado!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        handler.post(progressRunnable)
    }

    private fun resetProgress() {
        handler.removeCallbacksAndMessages(null)
        progress = 0
        binding.progressBarHorizontal.progress = 0
        binding.progressBarCircular.visibility = View.GONE
        binding.tvProgress.text = "Progreso: 0%"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        handler.removeCallbacksAndMessages(null)
        _binding = null
    }
}