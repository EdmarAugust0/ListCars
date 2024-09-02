package br.com.edmar;


public class Car {
	private String marca;
	private String modelo;
	
	public Car (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	@Override
	public String toString() {
		return "Marca=" + marca + ", Modelo=" + modelo;
	}
	
}
