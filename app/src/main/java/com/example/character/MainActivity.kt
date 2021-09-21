package com.example.character

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.character.Adapters.CharacterAdapters
import com.example.character.datas.Characters
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mCharacterList = ArrayList<Characters>()

    lateinit var mAdapters: CharacterAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCharacterList.add(Characters("투슬리스",2010,"887-1-341"))
        mCharacterList.add(Characters("심바",1994,"7-254-99757"))
        mCharacterList.add(Characters("앨리스",1951,"78-587-314"))
        mCharacterList.add(Characters("뮬란",1998,"547-7987-4577"))
        mCharacterList.add(Characters("라푼젤",2010,"1024-2345-6789"))
        mCharacterList.add(Characters("알라딘",1992,"789-5487-7877"))


        mAdapters = CharacterAdapters(this,R.layout.character_list_item,mCharacterList)
        character_list_view.adapter = mAdapters
//리스트뷰가 눌렸을 때 할 이벤트 작성
        character_list_view.setOnItemClickListener { adapterView, view, position, id -> 
            
//            캐릭터 리스너의 포지션 중 눌려있는 것을 확인해서 넣어줘라
            val clickedCharacter = mCharacterList[position]
            Toast.makeText(this, "${clickedCharacter.name}이 클릭됨", Toast.LENGTH_SHORT).show()
            
            
        }
    }
}