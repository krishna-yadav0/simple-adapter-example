package com.krishna.mytodoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title="Song List"

        //val songs = listOf<String>("Hello", "ABCD", "Coding", "Chill", "Unstoppable", "Dance", "Jai Ho",
        //  "Hello", "ABCD", "Coding", "Chill", "Unstoppable", "Dance", "Jai Ho")
        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Hello","Just the description"))
        songsObjects.add(Song("ABCD","Jhon lenon"))
        songsObjects.add(Song("Dance","The Rolling Stone"))
        songsObjects.add(Song("Chill","The Beatles"))
        songsObjects.add(Song("Alone","Alane Walker"))
        songsObjects.add(Song("Unstoppable","Australian singer SIA"))
        songsObjects.add(Song("Alec Benjamine","Let me down slowly"))
        songsObjects.add(Song("Criminal","Ra.One"))
        songsObjects.add(Song("Chennai Express","Title Song"))
        songsObjects.add(Song("Chham chham chham","Bhagi part 1"))
        songsObjects.add(Song("Lo safar suru ho gya","Bhagi part 2"))
        songsObjects.add(Song("Tum he ho Ashiqui","Ajit Singh"))
        songsObjects.add(Song("Tere sang yara","Atif Aslam"))
        songsObjects.add(Song("Tera chehra","Adnan shami"))

        val songList = findViewById<RecyclerView>(R.id.songList)
        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)
    }
}