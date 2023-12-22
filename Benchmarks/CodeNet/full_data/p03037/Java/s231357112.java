import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();

	int[] L = new int[N];
	int[] R = new int[N];
	int Lmax = 0;
	int Rmin = N;
	for(int i=0;i<M;i++){
	    L[i] = sc.nextInt();
	    R[i] = sc.nextInt();
	    if(L[i] > Lmax) Lmax=L[i];
	    if(R[i] < Rmin) Rmin=R[i];
	}
	System.out.print(Rmin -Lmax +1);
    }
}
