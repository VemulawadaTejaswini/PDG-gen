import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int d[] = new int[N];
		for(int i=0;i<N;i++){
			d[i] = scan.nextInt();
		}
		
		int Ans = 0;
		for(int i=0;N>i;i++){
			for(int j=1+i;N>j;j++){
				Ans += d[i] * d[j];
			}
		}
		System.out.println(Ans);
	}
}