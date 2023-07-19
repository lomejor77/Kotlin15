package cl.awakelabs.kotlin15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.awakelabs.kotlin15.databinding.ActivityMainBinding

/*Los pasos para crear un listado usando recycler view
* [x] Item Layout
*   [x] definir ID
*   [x] definir constraints
*   [x] Altura del item layout siempre en wrap_content
* [x] layout con recycler view
* [x] asignar layout manager
* [x] Adapter + ViewHolder
* [x] obtener los datos
*
* */
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.recyclerView.adapter = adapter
    }
}