import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	long[] A = new long[N];
	for(int i=0;i<N;i++) A[i]=sc.nextInt();
	Arrays.sort(A);

	int[] B = new int[M];
	long[] C = new long[M];
	int Bmai = 0;
	for(int i=0;i<M;i++){
	    B[i] = sc.nextInt();
	    Bmai += B[i];
	    C[i] = sc.nextInt();
	}
	long[] rep = new long[Bmai];
	int pla=0;
	for(int j=0;j<M;j++){
	    for(int k=0;k<B[j];k++){
		rep[pla] = C[j];
		pla++;
	    }
	}
	Arrays.sort(rep);

	//for(int i=0;i<N;i++) System.out.print(A[i]+" ");
	//System.out.println();
	//for(int i=0;i<Bmai;i++) System.out.print(rep[i]+" ");
	
	for(int i=0;i<Math.min(N,Bmai);i++){
	    
	    if(A[i] < rep[Bmai-1-i]) A[i]=rep[Bmai-1-i];
	    else break;
	}
	long count = 0;
	for(int i=0;i<N;i++) count += A[i];
	System.out.print(count);	
    }
}
