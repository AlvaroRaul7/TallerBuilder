package emsablajeComputadoras.builder;

import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusZenBookBuilder extends CompuBuilder {
	public 
	@Override
	public void definirCompu() {
		// TODO Auto-generated method stub
				SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Home");
				Mainboard mainb = new Mainboard("Prime", "z370");
				Computador c = new Computador(16, os, 500, mainb, "Asus", "ZenBook");
	}

	@Override
	public void construirSO() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Home");
		compu.setOs(os);
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