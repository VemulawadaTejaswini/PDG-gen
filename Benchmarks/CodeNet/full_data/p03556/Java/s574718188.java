import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);

		int a = sc.nextInt();
		int i = 0;
		while(i*i <= a){
			i++;
			
		}
		System.out.println((i-1)*(i-1));
	}
}