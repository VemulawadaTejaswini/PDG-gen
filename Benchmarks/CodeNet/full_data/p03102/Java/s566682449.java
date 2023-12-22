import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int C=stdIn.nextInt();
		int A[]=new int[M];
		int B[]=new int[M];
		int z=0,y=0,ans=0,cou=0;
		while(z<M){
			B[z]=stdIn.nextInt();
			z++;
		}z=0;
		while(y<N){
			while(z<M){
				A[z]=stdIn.nextInt();
				cou+=A[z]*B[z];
				z++;
			}z=0;
			cou+=C;
			if(cou>0)
				ans++;
			cou=0;
			y++;
		}
		System.out.println(ans);
	}

}