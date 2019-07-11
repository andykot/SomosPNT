package ar.somospnt.entities;

public  class ProductoGeneral implements  Comparable<ProductoGeneral> {

	private String nombre;
	private double precio;
	
	
	public ProductoGeneral(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "ProductoVenta []";
	}
	@Override
	public int compareTo(ProductoGeneral otroproducto) {
		int a =0;
		if (this.precio < otroproducto.precio) {
			
			a=-1;	
		}else if (this.precio > otroproducto.precio){
			
			a=1;
		}
		
		return a;
		
	}
	
	
	
	
	
	
}
