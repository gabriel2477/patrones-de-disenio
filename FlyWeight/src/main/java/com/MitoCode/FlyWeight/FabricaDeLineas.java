package com.MitoCode.FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeLineas {

	private List<ILineaLigera> lineas;

	public FabricaDeLineas() {
		this.lineas = new ArrayList<ILineaLigera>();
	}
	
	public ILineaLigera getLine( String color) {
		
		// Comprobar si ya existe una linea con el color solicitado
		for(ILineaLigera linea : this.lineas) {
			if( linea.getColor().equals(color) ) {
				System.out.println("Linea de color [" + color + "] econtrada, la devolvemos");
				return linea;
			}
		}
		
		// Sino ha sido creada la creamos ahora, la agregamos a la lista y la devolvemos
		System.out.println("Creando una linea de color [" + color + "]");
		
		ILineaLigera linea = new Linea( color );
		this.lineas.add( linea );
		
		return linea;
		
		
	}
	
}
