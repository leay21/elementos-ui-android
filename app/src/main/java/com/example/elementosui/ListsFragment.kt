package com.example.elementosui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.elementosui.databinding.FragmentListsBinding

class ListsFragment : Fragment() {

    private var _binding: FragmentListsBinding? = null
    private val binding get() = _binding!!

    private val sampleData = listOf(
        "Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5",
        "Elemento 6", "Elemento 7", "Elemento 8", "Elemento 9", "Elemento 10"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar ListView
        val listViewAdapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            sampleData
        )
        binding.listView.adapter = listViewAdapter
        binding.listView.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(requireContext(),
                "ListView: ${sampleData[position]}", Toast.LENGTH_SHORT).show()
        }

        // Configurar RecyclerView
        val recyclerViewAdapter = SimpleAdapter(sampleData) { item ->
            Toast.makeText(requireContext(),
                "RecyclerView: $item", Toast.LENGTH_SHORT).show()
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = recyclerViewAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    class SimpleAdapter(
        private val items: List<String>,
        private val onItemClick: (String) -> Unit
    ) : androidx.recyclerview.widget.RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {

        class ViewHolder(view: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(view) {
            val textView: android.widget.TextView = view.findViewById(android.R.id.text1)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = items[position]
            holder.itemView.setOnClickListener {
                onItemClick(items[position])
            }
        }

        override fun getItemCount() = items.size
    }
}