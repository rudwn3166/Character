package com.example.character.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.character.R
import com.example.character.datas.Characters

class CharacterAdapters (val mContext : Context,
                         val resId :Int,
                         val mList:ArrayList<Characters>) : ArrayAdapter<Characters>(mContext, resId, mList){
                          val inf =LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.character_list_item,null)
        }
        val row = tempRow!!

        val characterData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthTxt = row.findViewById<TextView>(R.id.birthYearTxt)
        val phoneTxt = row.findViewById<TextView>(R.id.phoneTxt)

        nameTxt.text = characterData.name

        birthTxt.text = "(${characterData.birth}년생)"
        phoneTxt.text = characterData.phone
        return row
    }
                         }

