import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int S[] = new int [4];
		S[0]=teclado.nextInt();S[1]=teclado.nextInt();S[2]=teclado.nextInt();S[3]=teclado.nextInt();
		if(S[0]==S[1] || S[1]==S[2] || S[2]==S[3]) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
		
		

	

	 }
}


