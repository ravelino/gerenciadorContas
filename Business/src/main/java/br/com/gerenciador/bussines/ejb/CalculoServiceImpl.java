package br.com.gerenciador.bussines.ejb;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calcular
 */
@Stateless(mappedName = "ejb/Calcular")
@LocalBean
public class CalculoServiceImpl implements CalculoService, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8942180818131323153L;

	/**
     * Default constructor. 
     */
    public CalculoServiceImpl() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int somar(int a, int b) {
		return (a + b);
	}

}
