
public class Rectangulo implements FiguraGeometrica {
	private double base;
	private double altura;
	private String nombre;
	
	public Rectangulo(String nombre, double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}//constructor
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public double calcularArea() {
		return base * altura;
	}//calcularArea

	@Override
	public double calcularPerimetro() {
		return base * 2 + altura * 2;
	}//calcularPerimetro


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}

}
