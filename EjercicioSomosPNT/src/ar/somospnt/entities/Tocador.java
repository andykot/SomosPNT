package ar.somospnt.entities;

public class Tocador extends ProductoGeneral {
	
	private double contenido;

	
	public Tocador(String nombre, double precio, double contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
	return "Nombre: "+ this.getNombre() + " /// " + "Contenido: " + this.getContenido() +  "ml /// " + "Precio: $" +this.getPrecio();
	}
	

}
