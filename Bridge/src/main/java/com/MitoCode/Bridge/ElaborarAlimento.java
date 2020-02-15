package com.MitoCode.Bridge;

import com.Mitocode.Interfaces.IElaborar;

public abstract class ElaborarAlimento {

	//Referencia al implementador
	IElaborar implementador;
	
	public IElaborar getImplementador() {
		return this.implementador;
	}
	
	public void setImplementador(IElaborar implementador) {
		this.implementador = implementador;
	}
	
	// Método a implementar por las clases que hereden
	public abstract void obtener();
	
	
}
