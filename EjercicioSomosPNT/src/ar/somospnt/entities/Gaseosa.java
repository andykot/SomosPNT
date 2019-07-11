package ar.somospnt.entities;

public class Gaseosa extends ProductoGeneral {

	private double litro;


	public Gaseosa(String nombre, double precio, double litro) {
		super(nombre, precio);
		this.litro = litro;
	}

	public double getLitro() {
		return litro;
	}

	public void setLitro(double litro) {
		this.litro = litro;
	}

	@Override
	public String toString() {
	return "Nombre: "+ this.getNombre() + " /// " + "Litros: " + this.getLitro() +  " /// " + "Precio: $" +this.getPrecio();
						
	}
	
	
		
		
		
		
	}
	
	

