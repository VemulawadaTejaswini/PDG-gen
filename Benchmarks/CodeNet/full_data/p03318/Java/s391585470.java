import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int k=1;
		while(k<=K) {
			if(k<10) {		
				System.out.println(k);
			}else {
				System.out.println(10*(k-9)+9);
			}			
			k++;
		}

	}

}