public class Producto {

	private	int		idProducto;
	private String	nombreProducto;
	private	float	precioProducto;
	private	long	existenciasProducto;
	
	public void mostrarNombreProducto() {
		System.out.println(nombreProducto);
	}
	
	public void mostrarPrecioProducto() {
		System.out.println(precioProducto);
	}
	
	public void mostrarExistenciasProducto() {
		System.out.println(existenciasProducto);
	}

	
	
	public Producto() {
		super();
	}

	public Producto(int idProducto, String nombreProducto, float precioProducto, long existenciasProducto) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existenciasProducto = existenciasProducto;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}

	public long getExistenciasProducto() {
		return existenciasProducto;
	}

	public void setExistenciasProducto(long existenciasProducto) {
		this.existenciasProducto = existenciasProducto;
	}
	
	
	
	
}
