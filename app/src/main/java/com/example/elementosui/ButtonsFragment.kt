package com.example.elementosui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.elementosui.databinding.FragmentButtonsBinding

class ButtonsFragment : Fragment() {

    private var _binding: FragmentButtonsBinding? = null
    private val binding get() = _binding!!
    private var clickCount = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentButtonsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNormal.setOnClickListener {
            clickCount++
            Toast.makeText(requireContext(),
                "Botón normal clickeado $clickCount veces", Toast.LENGTH_SHORT).show()
        }

        binding.imageButton.setOnClickListener {
            Toast.makeText(requireContext(),
                "ImageButton clickeado", Toast.LENGTH_SHORT).show()
        }

        binding.btnToggle.setOnClickListener {
            val isEnabled = binding.btnToggle.isEnabled
            binding.btnToggle.isEnabled = !isEnabled
            Toast.makeText(requireContext(),
                if (!isEnabled) "Botón activado" else "Botón desactivado",
                Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}