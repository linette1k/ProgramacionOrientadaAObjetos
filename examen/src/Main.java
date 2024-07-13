/**
 * @author LinetteJuarez
 */
public class Main {

	public static void main(String[] args) {
		
		Producto takisFuego = new Producto(1, "takis fuego", 14f, 1000);
		Producto sabritasSal = new Producto();
		Producto coquita = new Producto(3, "Coca cola", 20, 100000);
		
		imprimirDatosProducto(takisFuego);
		
		imprimirDatosProducto(sabritasSal);
		
		sabritasSal.setNombreProducto("Sabritas Sal");
		sabritasSal.setIdProducto(2);
		sabritasSal.setExistenciasProducto(10000);
		sabritasSal.setPrecioProducto(20);
		
		imprimirDatosProducto(sabritasSal);
		
		imprimirDatosProducto(coquita);
		
		
		
		
	}
	
	public static void imprimirDatosProducto(Producto p) {
		System.out.println("Identificador del producto = " + p.getIdProducto());
		System.out.println("Nombre del producto = " + p.getNombreProducto());
		System.out.println("Precio del producto = $" + p.getPrecioProducto());
		System.out.println("Existencias del producto = " + p.getExistenciasProducto());
		System.out.println();
		System.out.println();
	}

}

