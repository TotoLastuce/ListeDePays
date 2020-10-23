package com.example.andversion

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.list_card.*

class AndVersionAdapter(val items: Array<AndVersion>) :
    RecyclerView.Adapter<AndVersionAdapter.ViewHolder>() {

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view), LayoutContainer {

        override val containerView: View?
            get() = itemView

        fun bindAndVersion(andVersion: AndVersion) {
            with(andVersion) {
                andVersionTxt.text = name
                andVersionPop.text = pop
                andVersionImg.setImageResource(andVersion.img)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot:
        Boolean = false): View {
            return LayoutInflater.from(context).inflate(layoutRes, this,
                attachToRoot)
        }
        return ViewHolder(parent.inflate(R.layout.list_card))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindAndVersion(items[position])
    }

    override fun getItemCount(): Int = items.size
}