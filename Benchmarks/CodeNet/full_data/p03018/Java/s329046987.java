import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static int orozco = 0;
	public static int maior = 0;
		public static void trocar(String[] vetor, int i) {
			if(vetor[i].equals("A") && vetor[i+1].equals("B") && vetor[i+2].equals("C")) {
				if(i+2 > maior) {
					maior = i+2;
				}
				vetor[i] ="B";
				vetor[i+1] ="C";
				vetor[i+2] ="A";
				orozco++;
				trocar(vetor, i-1);
				trocar(vetor, i+2);
				}}
		
		public static void main(String[] args) throws IOException {
			Scanner teclado = new Scanner(System.in);
			String a = teclado.next();
			String[] x = new String[a.length()+15];
			for(int i = 0;i<3;i++) {
					x[i] = "0";
					x[a.length()+3+i] = "0";
			}
			for(int i = 0;i<a.length();i++) x[i+3] = a.substring(i, i+1);
			for(int i = 2;i<a.length()+1;i++) { 
				if(i<maior){
					i = maior;
				}
				trocar(x, i);
			}
			System.out.println(orozco);
	}
}