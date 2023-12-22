import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();

	int L = 0;
	int R = 0;
	int Lmax = 0;
	int Rmin = N;
	for(int i=0;i<M;i++){
	    L = sc.nextInt();
	    R = sc.nextInt();
	    if(L > Lmax) Lmax=L;
	    if(R < Rmin) Rmin=R;
	}
	if(Lmax <= Rmin) System.out.print(Rmin -Lmax +1);
	else System.out.print(0);
    }
}
