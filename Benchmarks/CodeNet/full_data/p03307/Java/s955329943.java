import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;

			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			if(n%2!=0){
				n = 2*n;}
			System.out.println(n);

	}}