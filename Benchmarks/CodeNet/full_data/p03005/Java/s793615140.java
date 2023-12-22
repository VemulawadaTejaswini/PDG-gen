import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), K = sc.nextInt();
			System.out.println(K == 1 ? 0 : N - K);
		}
	}
}