package emsablajeComputadoras.builder;

import emsamablajecomputadoras.creacional.Computador;

public class CompuDirector {
	 private CompuBuilder build;

	 public CompuDirector(CompuBuilder c)  {
		 this.build=c;
		 
	 }
	 
	 public void construirComputadora() {
		 build.definirCompu();
		 build.construirSO();
		 build.construirMain();
		 
	 }
	 
	 public Computador getComputadora() {
		 
		 return this.build.getComputador();
	 }
}
