package br.com.gerenciador.bussines.ejb;

import javax.ejb.Local;

@Local
public interface CalculoService {
	
	public int somar(final int a, final int b);

}
