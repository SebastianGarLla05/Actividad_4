package actividad4;

import java.util.Scanner;

public class runmenu {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        String figure;
	        double length;
	        String operation;

	        System.out.println("¿Qué figura deseas calcular? (círculo o cuadrado)");
	        figure = scanner.nextLine();

	        System.out.println("¿Cuál es la longitud de el " + figure + "? (lado o radio)");
	        length = scanner.nextDouble();

	        System.out.println("¿Qué operación deseas realizar? (diagonal (solo cuadrado), perímetro, área o circunferencia(solo círculo)");
	        operation = scanner.next();

	        if (figure.equals("círculo")) {
	            circulo crql = new circulo ((double) length);
	            if (operation.equals("circunferencia")) {
	                System.out.println("La circunferencia del círculo es: " + crql.calcularCircunferencia());
	            } else if (operation.equals("área")) {
	                System.out.println("El área del círculo es: " + crql.calcularArea());
	            } else {
	                System.out.println("Operación inválida para un círculo");
	            }
	        } else if (figure.equals("cuadrado")) {
	            cuadrado cuadra = new cuadrado ((double) length);
	            if (operation.equals("diagonal")) {
	                System.out.println("La diagonal del cuadrado es: " + cuadra.calcularDiagonal());
	            } else if (operation.equals("perímetro")) {
	                System.out.println("El perímetro del cuadrado es: " + cuadra.calculaPerimetroCuadrado());
	            } else if (operation.equals("área")) {
	                System.out.println("El área del cuadrado es: " + cuadra.calcularAreaCuadrado());
	            } else {
	                System.out.println("Operación inválida para un cuadrado");
	            }
	        } else {
	            System.out.println("Figura inválida");
	        }
	    }
	}