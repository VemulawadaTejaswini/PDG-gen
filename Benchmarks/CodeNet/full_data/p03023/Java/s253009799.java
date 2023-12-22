import java.util.Scanner;
public class UMA {
	public static void main (String[]args){
		Scanner tc =new Scanner(System.in);
		int N,S;
		N=tc.nextInt();
			S= (N - 2)*180;
		if(N<=3 && N>=100){
			N=tc.nextInt();
			S = (N - 2)*180;
		}
		System.out.println(S);
	}

}
