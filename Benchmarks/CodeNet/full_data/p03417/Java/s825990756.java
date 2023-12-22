import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if(N==1){
			System.out.println(M-2);
		}else if(M ==1){
			System.out.println(N-2);
		}else System.out.println((N-2)*(M-2));
		sc.close();
	}
}
