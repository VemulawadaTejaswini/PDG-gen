import java.util.Arrays;
import java.util.Scanner;



class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	int A[] = new int[N];
    	int B[] = new int[M];
    	
    	for (int i = 0;i<N;i++){
       	A[i]=sc.nextInt();
       	}
    	
       	for(int i = 0;i<M;i++){
       	B[i]=sc.nextInt();
       	}
       	
       	Arrays.sort(A);
       	Arrays.sort(B);
   
       	if(A[N-1]<=B[0]){
       		System.out.println("No war");
       		
       	}else{
       		System.out.println("War");
       	}
       	

    }

}