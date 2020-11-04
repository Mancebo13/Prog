package proyectos;
import java.util.*;
public class pesetaEuro {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double p;
		double e;
		System.out.println("Cantidad de pesetas:");
		p=teclado.nextDouble();
		e=(p*0.006);
		System.out.println("La cantidad en euros es: " +e+ "€");

	}

}
