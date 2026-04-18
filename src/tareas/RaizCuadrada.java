package tareas;
import java.util.*;
public class RaizCuadrada {
	public static long mcd(long a, long b) {
	    a = Math.abs(a);
	    b = Math.abs(b);

	    while (b != 0) {
	        long temp = b;
	        b = a % b;
	        a = temp;
	    }
	    return a;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese n:");
        long n = sc.nextLong();
        long inicio = System.nanoTime();

        if (n <= 3) {
            System.out.println("n debe ser mayor que 3");
            return;
        }

        // 1. y aleatorio en [2, n-2]
        long y = 2 + (long)(rand.nextDouble() * (n - 3));

        // 2. a = y^2 mod n
        long a = (y * y) % n;

        System.out.println("y = " + y);
        System.out.println("a = " + a);

        // 3. buscar x tal que x^2 ≡ a mod n
        for (long x = 0; x < n; x++) {

            if ((x * x) % n == a) {

                long modY = Math.floorMod(y, (int)n);
                long modNegY = Math.floorMod(-y, (int)n);

                // 4. verificar x ≡ ±y (mod n)
                if (x != modY && x != modNegY) {
                    System.out.println("x = " + x);
                    long p = mcd(x - y, n);
                    if (p != 1 && p != n) {
                        System.out.println("Factor encontrado: " + p);
                        //return;
                    }
                }
            }
        }

        long fin = System.nanoTime();
        System.out.println("Tiempo (ns): " + (fin - inicio));
    }

}
