package atmWithCoins;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// ------------------------------------------------------------------- >
		double N = 576.73, M = 0;
		double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
		double c50 = 0, c25 = 0, c10 = 0, c5 = 0, c1 = 0;
		// ------------------------------------------------------------------- >
		n100 = N / 100;
		N %= 100;
		// ---------------- >
		n50 = N / 50;
		N %= 50;
		// ---------------- >
		n20 = N / 20;
		N %= 20;
		// ---------------- >
		n10 = N / 10;
		N %= 10;
		// ---------------- >
		n5 = N / 5;
		N %= 5;
		// ---------------- >
		n2 = N / 2;
		N %= 2;
		// ---------------- >
		n1 = N / 1;
		N %= 1;

		System.out.printf("Updated N: %.2f%n", N);
		M = N * 100;
		System.out.printf("Updated M: %.2f%n", M);
		// ------------------------------------------------------------------- >
		System.out.println("NOTAS:");
		System.out.println((int) n100 + " nota(s) de R$ 100.00");
		System.out.println((int) n50 + " nota(s) de R$ 50.00");
		System.out.println((int) n20 + " nota(s) de R$ 20.00");
		System.out.println((int) n10 + " nota(s) de R$ 10.00");
		System.out.println((int) n5 + " nota(s) de R$ 5.00");
		System.out.println((int) n2 + " nota(s) de R$ 2.00");
		// -------------------------------- >
		System.out.println("MOEDAS:");
		System.out.println((int) n1 + " moeda(s) de R$ 1.00");
		// -------------------------------- >
		System.out.println((int) c50 + " moeda(s) de R$ 0.50");
		System.out.println((int) c25 + " moeda(s) de R$ 0.25");
		System.out.println((int) c10 + " moeda(s) de R$ 0.10");
		System.out.println((int) c5 + " moeda(s) de R$ 0.05");
		System.out.println((int) c1 + " moeda(s) de R$ 0.01");

		// ------------------------------------------------------------------- >

		// ------------------------------------------------------------------- >
		sc.close();
	}

}
