package cl.awakelabs.kotlin15

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelabs.kotlin15.databinding.ItemBinding

/*
* Implementar clase Adapter y hereda RecyclerView
*
* */

class Adapter: RecyclerView.Adapter <Adapter.ViewHolder>() {
  /*se crea la lista del objeto del dataclass*/
    var listPokemon = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding =  ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listPokemon.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listPokemon[position]
        holder.bind(item)
    }

    fun setData(pokedex: List<Pokemon>) {
        this.listPokemon = pokedex.toMutableList()
    }

    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {
            binding.textName.text = pokemon.name
            binding.textLabel.text = pokemon.type
        }

    }
}