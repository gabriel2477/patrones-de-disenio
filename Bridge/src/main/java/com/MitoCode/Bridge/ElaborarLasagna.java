package com.MitoCode.Bridge;

import com.Mitocode.Interfaces.IElaborar;

public class ElaborarLasagna extends ElaborarAlimento{

	public ElaborarLasagna(IElaborar implementador) {
		this.setImplementador(implementador);
	}

	@Override
	public void obtener() {
		
		System.out.println("Preparando Lasagna...");
		this.getImplementador().procesar();
		
	}
	
	
	
}
