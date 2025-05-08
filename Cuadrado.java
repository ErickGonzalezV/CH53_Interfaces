
public class Cuadrado implements FiguraGeometrica {
	private double lado; 
	private String nombre;
	public Cuadrado(String nombre, double lado) {
		super();
		this.lado = lado;
		this.nombre = nombre;
	}//constructor
	
	public double getLado() {
		return lado;
	}//getLado
	public void setLado(double lado) {
		this.lado = lado;
	}//setLado
	public String getNombre() {
		return nombre;
	}//getNombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", nombre=" + nombre + "]";
	}//toString

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}
	

}
