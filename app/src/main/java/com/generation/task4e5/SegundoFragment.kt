package com.generation.task4e5

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {

    private lateinit var binding : FragmentSegundoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSegundoBinding.inflate(layoutInflater, container, false)




     binding.voltar1.setOnClickListener {

            val autor = binding.editTextTextPersonName.text.toString()
            val titulo = binding.editTextTextPersonName4.text.toString()
            val descricao = binding.editTextTextPersonName3.text.toString()
            val data = binding.editTextTextPersonName6.text.toString()
            val hora = binding.editTextTextPersonName7.text.toString()

            if (autor.isEmpty()|| titulo.isEmpty() ||descricao.isEmpty() || data.isEmpty()  ||hora.isEmpty()) {
                Toast.makeText(
                    context,  "Preencha todos os campos!", Toast.LENGTH_LONG
                ).show()
            } else {

                findNavController().navigate(
                    R.id.action_segundoFragment_to_listFragment


                )
            }
        }


        return binding.root
    }
    //fun

}