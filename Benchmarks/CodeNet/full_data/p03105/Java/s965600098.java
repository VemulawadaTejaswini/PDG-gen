import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int counter = 0;
		while(true) {
			if(counter>=C)break;
			if(A>B)break;
			
			B = B-A;
			counter++;
		}
		System.out.println(counter);
		
	}}