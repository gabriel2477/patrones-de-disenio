package com.mitocode;

import com.MitoCode.Bridge.ElaborarAlimento;
import com.MitoCode.Bridge.ElaborarLasagna;

public class App {

	public static void main(String[] args) {
		
		/* Veamos un ejemplo de uso de este patrón en el que creamos un sistema para elaborar lasagna, 
		pudiendo ésta ser de carne o de verduras*/
		
		// Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
		
		ElaborarAlimento lasagna = new ElaborarLasagna(new Carne());
		lasagna.obtener();
		
		// Ahora le indicamos que use otra implementación para obtener la de verduras
		//Aqui se utiliza el puente para pasarle otra implementacion en tiempo de ejecución
		
		lasagna.setImplementador(new Verduras());
		lasagna.obtener();


	}

}
