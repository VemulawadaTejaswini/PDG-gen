import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int L = teclado.nextInt();
		int V[] = new int [N];
		int quant = 0, menor = Integer.MAX_VALUE, soma = 0, maior = -(Integer.MAX_VALUE);
		
		for (int x = 0; x < N; x++) {
			V[x] = L;
			L++;
			soma = soma + V[x];
		}

		for (int x = 0; x < N; x++) {
			if (V[x] == 0) {
				quant = quant + 1;
			}
			
			if (V[x] < menor) {
				menor = V[x];
			}

			if (maior < V[x]) {
				maior = V[x];
			}
		}
		
		if (quant >= 1) {
			System.out.println(soma);
		}
		
		else {
		
		if (L < 0) {
			soma = soma - maior;
			System.out.println(soma);
		}
		
		else {
			soma = soma - menor;
			System.out.println(soma);
		}
		}
		
		teclado.close();
		
	}

}
