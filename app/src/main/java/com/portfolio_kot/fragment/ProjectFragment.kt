import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.igalata.bubblepicker.adapter.BubblePickerAdapter
import com.igalata.bubblepicker.model.PickerItem
import com.igalata.bubblepicker.rendering.BubblePicker
import com.portfolio_kot.R

class ProjectFragment : Fragment() {


    companion object {
        fun newInstance() : ProjectFragment{
            return  ProjectFragment()
        }
    }


    lateinit var bubblepicker : BubblePicker
    val project_title : ArrayList<String> = arrayListOf<String>("Mars888","Shioktrip","TakeMyTravel","Hangaround","360")
    lateinit var mycontext: Context


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val  view = inflater!!.inflate(R.layout.project_frg_layout,container,false)
        bubblepicker =  view.findViewById(R.id.picker)

        bubblepicker.adapter = object :  BubblePickerAdapter {
            override val totalCount: Int
                get() = project_title.size

            override fun getItem(position: Int): PickerItem {

                return  PickerItem().apply {
                        title =  project_title[position]
                        textColor = ContextCompat.getColor(mycontext,android.R.color.white)

                }
            }
        }

        bubblepicker.centerImmediately = true

        return  view

    }

    override fun onAttach(context: Context?) {


        mycontext = context!!
        super.onAttach(context)

    }

    override fun onResume() {
        super.onResume()
        bubblepicker.onResume()
    }

    override fun onPause() {
        super.onPause()
        bubblepicker.onPause()
    }

}