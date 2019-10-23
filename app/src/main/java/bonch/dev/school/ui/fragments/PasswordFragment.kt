package bonch.dev.school.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

import bonch.dev.school.R

class PasswordFragment : DialogFragment() {

    companion object{
        val fragmentTitle = "passwordTitle"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog!!.setTitle(fragmentTitle)
        return inflater.inflate(R.layout.fragment_password, container, false)
    }


}
