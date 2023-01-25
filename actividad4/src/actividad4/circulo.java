package actividad4;

public class circulo {

double x;
	
	public circulo(double length)
	{
		this.x = length;
	}
		
	public double calcularCircunferencia() 
	{
		return 2*(3.1416)*(x);
	}
		
	public double calcularArea() 
	{
		return 3.1416*(x*x);
	}
		
	public void cambiaLongitud(float y) 
	{
		x = y;
	}
}
