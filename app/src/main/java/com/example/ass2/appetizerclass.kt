package com.example.ass2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment

class appetizerclass:DialogFragment(R.layout.appetizer_custom) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt: Button = view.findViewById(R.id.cancelid)
        val submitbt:Button = view.findViewById(R.id.subid)
        val radioGroup = view.findViewById<RadioGroup>(R.id.radgid)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val selectedoption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedoption)
            val m1:MainActivity = activity as MainActivity;
            m1.recieveFeedback(radioButton.text.toString())
            dismiss()
        }
    }

}