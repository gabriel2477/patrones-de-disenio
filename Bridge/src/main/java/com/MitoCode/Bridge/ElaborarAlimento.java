package com.MitoCode.Bridge;

import com.Mitocode.Interfaces.IElaborar;

public abstract class ElaborarAlimento {

	IElaborar implementador;
	
	public IElaborar getImplementador() {
		return this.implementador;
	}
	
	public void setImplementador(IElaborar implementador) {
		this.implementador = implementador;
	}
	
	public abstract void obtener();
	
	
}
