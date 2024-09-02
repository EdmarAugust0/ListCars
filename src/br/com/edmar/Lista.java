package br.com.edmar;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<Car> cars;
	
	public Lista() {
		this.cars = new ArrayList<>();
	}
	
	public void adicionarCarro(Car car) {
		cars.add(car);
	}
	
	public void listarCarros() {
		System.out.println("Carros na lista");
		for (Car car: cars) {
			System.out.println(car);
		}
	}
}
