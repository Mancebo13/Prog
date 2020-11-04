package examen;
import java.util.*;
public class ejercicio2 {

	static String impar(int n) {
		String x;
		if (n%2==1) {
			x="Si es impar";
		}else {
			x="No es impar";
		}
		return x;
	}
	
	public static void main(String[] args) {
		int a;//parámetro de entrada
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un número");
		a=teclado.nextInt();
		String b =impar(a);//parámetro de salida
		System.out.println(b);
		

	}

}
