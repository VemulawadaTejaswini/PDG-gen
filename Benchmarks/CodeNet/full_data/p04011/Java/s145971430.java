import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int K=input.nextInt();
		int X=input.nextInt();
		int Y=input.nextInt();
		if(N<=K) {
			System.out.println(N*X);
		}else if(N>K){
			System.out.println(K*X+(N-K)*Y);
		}
	}
}