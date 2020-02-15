package com.mitocode;
import com.Mitocode.Interfaces.IElaborar;

public class Verduras implements IElaborar{

	public Verduras() {}
	
	@Override
	public void procesar() {
		//Operaciones necesarias para elaborar Lasagna de verdura.
		//...
		System.out.println("\tlasagna de verduras elaborada.");
	}
}
