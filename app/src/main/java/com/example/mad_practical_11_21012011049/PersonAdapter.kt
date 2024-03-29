package com.example.mad_practical_11_21012011049
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import java.util.ArrayList

class PersonAdapter(val context:MainActivity,  val Personarray : ArrayList<Person>):RecyclerView.Adapter<PersonAdapter.PersonViewHolder> (){
    inner class PersonViewHolder(val view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false)
        return PersonViewHolder(view)
    }
    override fun getItemCount(): Int {
        return Personarray.size
    }
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val view = holder.view
        view.findViewById<TextView>(R.id.name_textView).text = Personarray[position].name
        view.findViewById<TextView>(R.id.number_textView).text = Personarray[position].phoneNo
        view.findViewById<TextView>(R.id.email_textView).text = Personarray[position].emailId
        view.findViewById<TextView>(R.id.address_textView).text = Personarray[position].address
        view.findViewById<MaterialButton>(R.id.location_btn).setOnClickListener {
            Intent(context, MapsActivity::class.java).putExtra("Object", Personarray[position])
                .apply { context.startActivity(this) }
        }
        view.findViewById<MaterialButton>(R.id.delete_btn).setOnClickListener {
            context.delete(holder.adapterPosition)
        }
    }
}