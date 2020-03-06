package com.cis.uiquiz

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        //val redColor = Color.parseColor("#FF0000")
        //listView.setBackgroundColor(redColor)

        listView.adapter = MyCustomAdapter(this)
    }

    private class MyCustomAdapter(context: Context): BaseAdapter() {
        private val mContext: Context

        private val names = arrayListOf<String>(
            "นายกฤษฎา ท่าสะอาด","นายกัมพล โชติทอง","นายณัฐนนท์ ทาไธสง","นายนฤเบศร์ พระโรจน์",
            "นายพรหมพัฒน์ ชาญโชคประเสริฐ","นายเมธาวี สารีผล","นายรัฐเขต สีเหลือง","นายรุ่งโรจน์ พลเยี่ยม",
            "นายวิธาน วงษาบุตร","นางสาวศศิกร กอเสนาะรส","นางสาวอนันตยา โคตรศรี","นายอภิเดช นารอง",
            "นายอุทัยพันธ์ เที่ยงโคตร","นางสาวพัชรี แอแป","นางสาวศศิธร พิมมะทา","นายสุรพร อินพิลึก",
            "นายกฤษดา อุ่นสำโรง","นายณรงค์ศึก เตชะศรี","นายติยพล ต่อติด","นายทรัพย์ทวี เพ็ชรสาย",
            "นางสาวธิดารัตน์ ดานะพันธ์","นายปิยทัศน์ นวกิจวัฒนา","นายพรสิน มีสีบู","นายพัชรพล ไทยมานี้",
            "นายวงษกร พันธ์พิบูลย์","นายวรรณพงษ์ ภัททิยไพบูลย์","นายวิวัฒน์ วงษ์พิชัย","นางสาวศุภรัตน์ นพวัติ",
            "นางสาวสิรินาถ จริยพันธ์","นายเกียรติศักดิ์ วรภาพ","นางสาวธัญสิริ ผลไสว","นางสาวอาทิตยา ฉิมมาแก้ว"
        )

        private val id = arrayListOf<String>(
            "603410032-9","603410034-5","603410041-8","603410047-6",
            "603410052-3","603410057-3","603410059-9","603410060-4",
            "603410061-2","603410063-8","603410070-1","603410071-9",
            "603410073-5","603410155-3","603410156-1","603410157-9",
            "603410194-3","603410200-4","603410202-0","603410203-8",
            "603410204-6","603410208-8","603410210-1","603410211-9",
            "603410213-5","603410214-3","603410217-7","603410219-3",
            "603410221-6","603410289-2","603410291-5","603410321-2"
        )

        init {
            mContext = context
        }

        override fun getCount(): Int {
            return names.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.row_main, viewGroup, false)

            val nameTextView = rowMain.findViewById<TextView>(R.id.name_textView)
            nameTextView.text = names.get(position)
            val positionTextView = rowMain.findViewById<TextView>(R.id.position_textview)
            positionTextView.text = "เลขที่: $position"
            val stdID = rowMain.findViewById<TextView>(R.id.stdid)
            stdID.text = id.get(position)
            return rowMain
            //    val textView = TextView(mContext)
        //    textView.text = "That's my name"
        //    return textView
        }
    }
}
