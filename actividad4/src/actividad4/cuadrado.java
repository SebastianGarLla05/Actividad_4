package actividad4;

public class cuadrado {

public double x;
	
	public cuadrado() {
		this (171822);
	}
	
	public cuadrado (double length) {
		x = length;
	}
	
	public double calculaPerimetroCuadrado() {
		return x*4;
	}
	
	public double calcularAreaCuadrado() {
		return x*x;
	}
	
	public double calcularDiagonal() {
		return Math.sqrt((x*x)+(x*x));
	}
	
	public void cambiaLongitud(float y) {
		x = y;
	}
}