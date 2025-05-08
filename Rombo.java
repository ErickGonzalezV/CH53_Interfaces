
public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double lado;
	private double DiagonalMenor;
	private double DiagonalMayor;
	
	public Rombo(String nombre, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		DiagonalMenor = diagonalMenor;
		DiagonalMayor = diagonalMayor;
	}//constructor
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getDiagonalMenor() {
		return DiagonalMenor;
	}


	public void setDiagonalMenor(double diagonalMenor) {
		DiagonalMenor = diagonalMenor;
	}


	public double getDiagonalMayor() {
		return DiagonalMayor;
	}


	public void setDiagonalMayor(double diagonalMayor) {
		DiagonalMayor = diagonalMayor;
	}


	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", DiagonalMenor=" + DiagonalMenor + ", DiagonalMayor="
				+ DiagonalMayor + "]";
	}


	@Override
	public double calcularArea() {
		return ((DiagonalMayor*DiagonalMenor)/2);
	}

	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}



}
