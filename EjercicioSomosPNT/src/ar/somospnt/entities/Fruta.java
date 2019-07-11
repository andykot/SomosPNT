package ar.somospnt.entities;

public class Fruta extends ProductoGeneral {

	private String unidadVenta;

	public Fruta(String nombre, double precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}

	public String getUnidadVenta() {
		return unidadVenta;
	}

	public void setUnidadVenta(String unidadVenta) {
		this.unidadVenta = unidadVenta;
	}

	
	@Override
	public String toString() {
	return "Nombre: "+ this.getNombre() + " /// " + "Precio: $" +this.getPrecio() + " /// " + "Unidad de venta: " + this.getUnidadVenta() ;			
	}
	

	
	
	
	
}
