package cl.awakelabs.kotlin15

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
/*Los pasos para crear un listado usando recycler view
* [x] Item Layout
*   [ ] definir ID
*   [ ] definir constraints
*   [ ] Altura del item layout siempre en wrap_content
* [x] layout con recycler view
* [ ] asignar layout manager
* [ ] Adapter + ViewHolder
* [ ] obtener los datos
*
* */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}