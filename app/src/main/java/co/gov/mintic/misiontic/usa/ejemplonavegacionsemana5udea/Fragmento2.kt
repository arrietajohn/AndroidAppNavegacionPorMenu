package co.gov.mintic.misiontic.usa.ejemplonavegacionsemana5udea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Fragmento2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragmento2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        var btnAtras = view.findViewById<Button>(R.id.btnAtras2)
        btnAtras.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragmentosMenu)
        }

        var btnSig = view.findViewById<Button>(R.id.btnSiguiente2)
        btnSig.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.fragmento1)
        }
    }
}

