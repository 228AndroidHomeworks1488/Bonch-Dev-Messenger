package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragment

class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        initActivity()
    }

    fun initActivity(){

        initViews()
        setListeners()

        val fragmentManager = supportFragmentManager

        val fragment = ChatFragment()

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment_section, fragment)
            .commit()
    }

    fun initViews(){
    }

    fun setListeners(){

    }
}
