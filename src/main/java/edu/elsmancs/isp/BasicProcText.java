package edu.elsmancs.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicProcText implements Basic {

    List<String> texto = new ArrayList<String>();
	
	@Override
	public void nueva (String palabra) {
		texto.add(palabra);
	}

	@Override
	public String texto () {
		return texto.stream().collect(Collectors.joining(" "));
    }
    
}