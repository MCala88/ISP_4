package edu.elsmancs.isp;

import edu.elsmancs.isp.Compleja;
import edu.elsmancs.isp.Idioma;
import edu.elsmancs.isp.BasicProcText;

public class ComplexProcText extends BasicProcText implements Compleja {

    // Puede implementarse la interfaz Basica
    // e implementar de nuevo sus metodos
	@Override
	public boolean correcto (Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

}