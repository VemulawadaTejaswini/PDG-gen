import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long k = sc.nextLong();
		long n=1;
		for(long i=0; i<k; i++) {
			System.out.println(n);
			if(n<9)n++;
			else n+=10;
		}
	}
}