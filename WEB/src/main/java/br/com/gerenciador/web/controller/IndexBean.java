package br.com.gerenciador.web.controller;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 */

/**
 * @author ravelino
 *
 */

@ManagedBean(name="indexBean")
@SessionScoped
public class IndexBean {

	private int num1;
	
	private int num2;
	
	private String nome;
	
	private int resultado;
	
	/*@EJB(mappedName="CalculoService")
	private CalculoService calculoService;*/
	
	public IndexBean() {
		nome = "Rogério";
	}
	
	public void somar(){
		resultado = num1 + num2; 
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	/*public CalculoService getCalculoService() {
		return calculoService;
	}

	public void setCalculoService(CalculoService calculoService) {
		this.calculoService = calculoService;
	}*/
}
