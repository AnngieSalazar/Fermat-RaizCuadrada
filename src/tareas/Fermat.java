package tareas;
import java.util.*;
public class Fermat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero n: ");
		 long n = sc.nextLong();
		double x1 = Math.sqrt(n);
		long x = (long) Math.sqrt(n);
		long y =0;
		long p;
		long q;
		int contador=0;
		System.out.println("ingresaste: "+ n);
		System.out.println("Raiz de n: "+ x1);
		System.out.println("x: "+ x);
		long inicio = System.nanoTime();
		//while(Math.sqrt(Math.pow(x, 2)-n) != (int)(Math.sqrt(Math.pow(x, 2)-n))) {
		//	x=x+1;
		//	contador++;
		//};
		while (true) {
		    long temp = x * x - n;
		    long yTemp = (long) Math.sqrt(temp);
		    if (yTemp * yTemp == temp) {
		        y = yTemp;
		        break;
		    }
		    if(x>=n) {
		    	System.out.println("x no encontrado");
		    	break;
		    }
		    x++;
		    contador++;
		}
		long fin = System.nanoTime();
		y=(int)Math.sqrt(Math.pow(x, 2)-n);
		p=x+y;
		q=x-y;
		System.out.println("p: "+ p);
		System.out.println("q: "+ q);
		System.out.println("Iteraciones: " + contador);
		System.out.println("Tiempo (ns): " + (fin - inicio));
		
		
	}

}
