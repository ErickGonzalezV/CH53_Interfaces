
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triangulo T", 200, 100, 150);
		Cuadrado te = new Cuadrado("Cuadrado T", 25);
		Rectangulo tee = new Rectangulo ("Rectangulo T", 50, 30);
		Rombo rombin = new Rombo ("Rombin", 5, 7, 10);
		Romboide ramboide = new Romboide ("Romboide", 10, 3);
		Trapecio trape = new Trapecio ("trape", 5, 4, 3, 2, 1, 2, 6);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		Main.imprimirCalculos(te);
		Main.imprimirCalculos(tee);
		Main.imprimirCalculos(rombin);
		Main.imprimirCalculos(ramboide);
		Main.imprimirCalculos(trape);
	}//main
//generar interfaz figuraGeometrica
	//con los metodos a imrpimir y los calculos
	
	
	
	public static void imprimirCalculos(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+-------------------------------+");
		System.out.println("+| El area de [" + t.getNombre() + "]");
		System.out.println("+| es" + t.calcularArea());
		System.out.println("+| El permietro de [" + t.getNombre() + "]");
		System.out.println("+| es" + t.calcularPerimetro());
		System.out.println("+-------------------------------+");
	}
	}