import java.util.Scanner;

class abc077C{
    public static void main(String args[]){
	int count=0;
	int N;
	Scanner stdIn=new Scanner(System.in);

	N=stdIn.nextInt();

	int[] A=new int[N];
	int[] B=new int[N];
	int[] C=new int[N];

	for(int i=0;i<N;i++)
	    A[i]=stdIn.nextInt();
	for(int i=0;i<N;i++)
	    B[i]=stdIn.nextInt();
	for(int i=0;i<N;i++)
	    C[i]=stdIn.nextInt();

	for(int i=0;i<A.length;i++){
	    for(int j=0;j<B.length;j++){
		for(int k=0;k<C.length;k++){
		    if(A[i]<B[j] && B[j]<C[k]){
			count++;
		    }
		}
	    }
	}

	System.out.println(count);
    }
}
