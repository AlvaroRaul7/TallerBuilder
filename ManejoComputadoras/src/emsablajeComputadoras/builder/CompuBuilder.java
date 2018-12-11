package emsablajeComputadoras.builder;

import emsamablajecomputadoras.creacional.Computador;

public abstract class CompuBuilder {
	 protected Computador compu;
	  
	  
	  public abstract void definirCompu();
	  public abstract void construirSO();
	  public abstract void construirMain();
	  public abstract Computador getComputador();
}
