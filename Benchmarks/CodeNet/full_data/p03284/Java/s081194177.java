
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		
		if(N%K==0) {
			System.out.println("0");
		}else {
			System.out.println("1");
		}
		in.close();
	}
}