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
		int a;//par�metro de entrada
		Scanner teclado=new Scanner (System.in);
		System.out.println("Introduce un n�mero");
		a=teclado.nextInt();
		String b =impar(a);//par�metro de salida
		System.out.println(b);
		

	}

}
