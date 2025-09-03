package com.example.elementosui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.elementosui.databinding.FragmentSelectionBinding

class SelectionFragment : Fragment() {

    private var _binding: FragmentSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            Toast.makeText(requireContext(),
                "CheckBox ${if (isChecked) "marcado" else "desmarcado"}",
                Toast.LENGTH_SHORT).show()
        }

        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val option = when (checkedId) {
                R.id.radioOption1 -> "Opción 1"
                R.id.radioOption2 -> "Opción 2"
                R.id.radioOption3 -> "Opción 3"
                else -> "Desconocido"
            }
            Toast.makeText(requireContext(),
                "Seleccionado: $option", Toast.LENGTH_SHORT).show()
        }

        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            binding.textViewStatus.text = "Estado: ${if (isChecked) "Activado" else "Desactivado"}"
        }

        binding.btnShowSelection.setOnClickListener {
            val selectedOptions = StringBuilder()
            if (binding.checkBox.isChecked) selectedOptions.append("CheckBox, ")

            when (binding.radioGroup.checkedRadioButtonId) {
                R.id.radioOption1 -> selectedOptions.append("Opción 1, ")
                R.id.radioOption2 -> selectedOptions.append("Opción 2, ")
                R.id.radioOption3 -> selectedOptions.append("Opción 3, ")
            }

            selectedOptions.append("Switch: ${if (binding.switch1.isChecked) "ON" else "OFF"}")

            Toast.makeText(requireContext(),
                "Selecciones: $selectedOptions", Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}