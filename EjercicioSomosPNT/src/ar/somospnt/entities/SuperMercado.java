package ar.somospnt.entities;

import java.util.ArrayList;

import ar.somospnt.utilities.Inventario;

public class SuperMercado {
    private String nombre;
	private ArrayList<ProductoGeneral> cartelera;

	public SuperMercado(String nombreMercado) {
		this.nombre = nombreMercado;
		cartelera = new ArrayList<ProductoGeneral>();
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private ArrayList<ProductoGeneral> getCartelera() {
		return cartelera;
	}

	private void setCartelera(ArrayList<ProductoGeneral> cartelera) {
		this.cartelera = cartelera;
	}

	private void imprimir() {

		for (int i = 0; i < cartelera.size(); i++) {

			System.out.println(cartelera.get(i).toString());
		}
	}

	private void separador() {

		System.out.println("============================");

	}

	private void productoMasCaro() {

		ProductoGeneral p = cartelera.get(0);

		for (ProductoGeneral productoVenta : cartelera) {
			if (p.compareTo(p) > 0) {
				p = productoVenta;
			}
		}
		System.out.println("Producto más caro " + p.getNombre());
	}

	private void productoMasBarato() {

		ProductoGeneral p = cartelera.get(0);

		for (ProductoGeneral productoVenta : cartelera) {
			if (p.compareTo(p) < 0) {
			}
			p = productoVenta;
		}
		System.out.println("Producto más barato " + p.getNombre());
	}

	
	public void iniciar() {
		
		
		setCartelera(Inventario.productos());
		imprimir();
		separador();
		productoMasCaro();
		productoMasBarato();
		
		
	}
	
	
}

	