package id.sttbandung.studikasusuts

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewsPortalActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_news_portal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val data = arrayOf(
            getString(R.string.mk1),
            getString(R.string.mk2),
            getString(R.string.mk3),
            getString(R.string.mk4),
            getString(R.string.mk5),
            getString(R.string.mk6),
            getString(R.string.mk7),
            getString(R.string.mk8),
            getString(R.string.mk9),
            getString(R.string.mk10),
            getString(R.string.mk11),
            getString(R.string.mk12),
            getString(R.string.mk13),
            getString(R.string.mk14),
            getString(R.string.mk15),
            getString(R.string.mk16),
            getString(R.string.mk17),
            getString(R.string.mk18),
            getString(R.string.mk19),
            getString(R.string.mk20),
            getString(R.string.mk21),
            getString(R.string.mk22),
            getString(R.string.mk23),
            getString(R.string.mk24),
            getString(R.string.mk25),
            getString(R.string.mk26),
            getString(R.string.mk27),
            getString(R.string.mk28),
            getString(R.string.mk29),
            getString(R.string.mk30),
            getString(R.string.mk31)
        )
        val listView: ListView = findViewById(R.id.lv_portal)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            // Menampilkan pesan Toast dengan informasi berita yang diklik
            Toast.makeText(this, "Ini adalah Mata Kuliah ${data[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}