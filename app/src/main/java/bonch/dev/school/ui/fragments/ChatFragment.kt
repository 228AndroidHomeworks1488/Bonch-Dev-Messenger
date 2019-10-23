package bonch.dev.school.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import bonch.dev.school.R

class ChatFragment : Fragment() {

    private lateinit var sendMessageButton: Button
    private lateinit var changePasswordButton: Button
    private lateinit var thisView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        thisView = inflater.inflate(R.layout.fragment_chat, container, false)
        initFragment()
        return thisView
    }

    fun initFragment(){
        initViews()
        setListeners()
    }

    fun initViews(){
        sendMessageButton = thisView.findViewById(R.id.send_message_button)
        changePasswordButton = thisView.findViewById(R.id.change_password_button)
    }

    fun setListeners(){
        sendMessageButton.setOnClickListener{
            val profileFragment = ProfileFragment()
            fragmentManager!!.
                    beginTransaction().
                    replace(R.id.fragment_section, profileFragment).
                    commit()
        }
    }
}
