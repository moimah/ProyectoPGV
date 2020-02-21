package utils;

import java.io.Serializable;

public class Magic implements Serializable{
	
	private int operacion;	
	private double operadorA;	
	private double operadorB;
	
		
	public Magic() {
		
	}

	public Magic(int operacion, double operadorA, double operadorB) {
		super();
		this.operacion = operacion;
		this.operadorA = operadorA;
		this.operadorB = operadorB;
	}

	public int getOperacion() {
		return operacion;
	}

	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}

	public double getOperadorA() {
		return operadorA;
	}

	public void setOperadorA(double operadorA) {
		this.operadorA = operadorA;
	}

	public double getOperadorB() {
		return operadorB;
	}

	public void setOperadorB(double operadorB) {
		this.operadorB = operadorB;
	}
	
	
	
	
	
	
}
