import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			long N = scan.nextLong();//s
			long M = scan.nextLong();//c
			
			if(2*N>M) {//sを全部使い切るためのcの個数がない
				System.out.println(M/2);
			}else {
				long kosuu = N;
				M-=2*N;
				kosuu+=M/4;
				System.out.println(kosuu);
			}
			
		}
		
		
	}
		

}
