package br.com.marco.pokedex_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.marco.pokedex_android.R
import br.com.marco.pokedex_android.domain.PokemonType
import br.com.marco.pokedex_android.domain.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val charmander = Pokemon(
            "",
             4,
            "Charmander",
            listOf(PokemonType("Fire"))
        )

        val pokemons = listOf(charmander, charmander,charmander)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}