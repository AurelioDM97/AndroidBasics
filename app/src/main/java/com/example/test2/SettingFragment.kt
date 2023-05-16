package com.example.test2



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test2.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {

    private lateinit var binding: FragmentSettingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.confirmButton.setOnClickListener {
            val enteredValueId = binding.editId.text.toString()
            val enteredValuePassword = binding.editPassword.text.toString()
            val combinedText = "ID: $enteredValueId\n" +
                    "Password: $enteredValuePassword"

            binding.textView.text = enteredValuePassword
            binding.textView.text = enteredValueId
            binding.textView.text = combinedText

        }
    }
}

