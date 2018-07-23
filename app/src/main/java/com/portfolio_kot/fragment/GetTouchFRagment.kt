package com.portfolio_kot.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.portfolio_kot.R
import okhttp3.internal.Util


class GetTouchFRagment : Fragment() {

    companion object {

        fun gettouchFragobj(): GetTouchFRagment {

            return GetTouchFRagment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.gettouch_layout, container, false)
        val connectfb = view.findViewById(R.id.id_connnectfb) as Button
        val connectgithub = view.findViewById(R.id.id_connnectgithub) as Button
        val connectlinkedin = view.findViewById(R.id.id_connectlinkedin) as Button
        val connectwhatsapp = view.findViewById(R.id.id_connectwhatsapp) as Button

        connectfb.setOnClickListener(View.OnClickListener {
            connectmyprofileFun("https://www.facebook.com/saran.raj.9693")
        })
        connectgithub.setOnClickListener(View.OnClickListener {
            connectmyprofileFun("https://github.com/saranr689");
        })
        connectlinkedin.setOnClickListener(View.OnClickListener {
            connectmyprofileFun("https://www.linkedin.com/in/saranraj-devarajan-86a451aa")
        })
        connectwhatsapp.setOnClickListener(View.OnClickListener {

            connectmyprofileFun("http://api.whatsapp.com/send?phone=918144703123&text=hii")

/*            val intent  = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "hiii")
            intent.putExtra("Saranraj",  "918144703123@s.whatsapp.net")
            intent.setType("text/plain")
            intent.setPackage("com.whatsapp")
            startActivity(intent)*/

    /*        val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("")
            startActivity(intent)*/

        })

        return view
    }

    private fun connectmyprofileFun(connecturl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(connecturl))
        startActivity(intent)
    }
}