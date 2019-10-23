package bonch.dev.school.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

import bonch.dev.school.R

class ProfileFragment : Fragment() {

    private lateinit var changePasswordButton: Button
    private lateinit var dialogPassword: DialogFragment
    private lateinit var thisView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        thisView = inflater.inflate(R.layout.fragment_profile, container, false)
        initFragment()
        return thisView
    }

    fun initFragment(){
        initViews()
        setListeners()
    }

    fun initViews(){
        dialogPassword = PasswordFragment()
        changePasswordButton = thisView.findViewById(R.id.change_password_button)
    }

    fun setListeners(){
        changePasswordButton.setOnClickListener{
            dialogPassword.show(fragmentManager!!, PasswordFragment.fragmentTitle)
        }
    }

}
