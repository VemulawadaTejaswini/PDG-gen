
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		int[] antenas = {a,b,c,d,e};
		
		boolean connect = true;
		
		check : for(int i = 0; i< antenas.length-2; i++) {
			for(int j = i; j< antenas.length-1; j++) {
				if(antenas[j] - antenas[i] > k) {
					connect = false;
					break check;
				}
			}
		}
		
		String output = connect ? "Yay!" : ":)";
		
		System.out.println(output);
	}
}
