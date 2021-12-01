package co.gov.mintic.misiontic.usa.ejemplonavegacionsemana5udea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class FragmentosMenu : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragmentos_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var manejador = Navigation.findNavController(view)
        var botonFrag1 = view.findViewById<Button>(R.id.btnFragmento1)
        var botonFrag2 = view.findViewById<Button>(R.id.btnFragmento2)
        botonFrag1.setOnClickListener {
            manejador.navigate(R.id.fragmento1)
        }
        botonFrag2.setOnClickListener {
            manejador.navigate(R.id.fragmento2)
        }
    }
}



