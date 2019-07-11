package ar.somospnt.utilities;

import java.util.ArrayList;

import ar.somospnt.entities.*;


public class Inventario {

	public static ArrayList<ProductoGeneral> productos(){
		
		ProductoGeneral g1 = new Gaseosa("Coca-Cola Zero", 20, 1.5);
		ProductoGeneral g2 = new Gaseosa("Coca-Cola", 18, 1.5);
		ProductoGeneral t1 = new Tocador("Sampoo Sedal", 19, 500);
		ProductoGeneral f1 = new Fruta("Frutilla", 64, "Kilo");
		
		ArrayList<ProductoGeneral> listaProductos = new ArrayList<ProductoGeneral>();
		
		listaProductos.add(g1);
		listaProductos.add(g2);
		listaProductos.add(t1);
		listaProductos.add(f1);
		
		return listaProductos;
		
	}
	
	
}
