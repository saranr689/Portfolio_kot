package com.portfolio_kot.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.portfolio_kot.R

class SkillsFragment : Fragment() {

    lateinit var skillsfrg_recyclerview : RecyclerView



    companion object {

        fun skillgfragmentobj(): SkillsFragment {
            return SkillsFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.skillsfragment_layout, container, false)
        skillsfrg_recyclerview = view.findViewById(R.id.id_skills_frag_rv)
        skillsfrg_recyclerview.layoutManager = LinearLayoutManager(activity)
        skillsfrg_recyclerview.adapter = SkillsAdapter(context)
        return view
    }
}

class SkillsAdapter(val context: Context?) : RecyclerView.Adapter<SkillsAdapter.MyViewHolder>() {

     val skills_ttitle_list : ArrayList<String> = arrayListOf("ANDROID","JAVA","SKILLS")


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.titeltextview.text = skills_ttitle_list[position]

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view  =  LayoutInflater.from(context).inflate(R.layout.skills_itemview,parent,false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {

        Log.d("_D","size : "+skills_ttitle_list.size)
        return skills_ttitle_list.size
    }


    class MyViewHolder(  itemView : View) : RecyclerView.ViewHolder(itemView)  {

        val titeltextview  = itemView.findViewById(R.id.id_title_tv) as TextView

    }

}
