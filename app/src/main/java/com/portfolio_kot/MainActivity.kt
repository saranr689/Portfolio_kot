package com.portfolio_kot

import ProjectFragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.gc.materialdesign.views.ButtonRectangle
import com.portfolio_kot.fragment.GetTouchFRagment
import com.portfolio_kot.fragment.SkillsFragment
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {

    lateinit var circleImageView: CircleImageView
    lateinit var projectbutton: ButtonRectangle
    lateinit var skillsbtn: ButtonRectangle
    lateinit var contactbtn: ButtonRectangle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circleImageView = findViewById(R.id.profile_image)
        projectbutton = findViewById(R.id.id_projt_btn)
        skillsbtn = findViewById(R.id.id_skills_btn)
        contactbtn = findViewById(R.id.id_contact_btn)

        Picasso.get()
                .load("https://firebasestorage.googleapis.com/v0/b/cloudfirestoresample-fbc9e.appspot.com/o/4434391-animals-wallpapers.jpg?alt=media&token=af4b69b4-672b-4b82-9962-008a7ca40d82")
                .placeholder(R.drawable.plc_holder)
                .into(circleImageView)

        supportFragmentManager.beginTransaction().replace(R.id.id_fragment_container, ProjectFragment.newInstance(), "projectfragment").commit()


        projectbutton.setOnClickListener(View.OnClickListener {

            val fragment: android.support.v4.app.Fragment? = supportFragmentManager.findFragmentByTag("projectfragment")

            if (fragment == null)
                supportFragmentManager.beginTransaction().replace(R.id.id_fragment_container, ProjectFragment.newInstance(), "projectfragment").commit()

        })
        skillsbtn.setOnClickListener(View.OnClickListener {
            val fragment: android.support.v4.app.Fragment? = supportFragmentManager.findFragmentByTag("skillfragment")
            if (fragment == null)
                supportFragmentManager.beginTransaction().replace(R.id.id_fragment_container, SkillsFragment.skillgfragmentobj(), "skillfragment").commit()

        })

        contactbtn.setOnClickListener(View.OnClickListener {
            val fragment: android.support.v4.app.Fragment? = supportFragmentManager.findFragmentByTag("gettouchfragment")

            if (fragment == null)
                supportFragmentManager.beginTransaction().replace(R.id.id_fragment_container, GetTouchFRagment.gettouchFragobj(), "gettouchfragment").commit()

        })


    }


}
