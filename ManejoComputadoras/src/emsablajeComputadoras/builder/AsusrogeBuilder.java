package emsablajeComputadoras.builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusrogeBuilder extends CompuBuilder {
	 protected Computador computador;
	@Override
	public void definirCompu() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Pro");
		Mainboard mainb = new Mainboard("Strix", "x99");
		Computador c = new Computador(34, os, 1000, mainb, "Asus", "ROG");
		
	}

	@Override
	public void construirSO() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Pro");
		computador.setOs(os);
	}

	@Override
	public void construirMain() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Computador getComputador() {
		// TODO Auto-generated method stub
		return null;
	}

}