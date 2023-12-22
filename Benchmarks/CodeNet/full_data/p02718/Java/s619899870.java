import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int[N];
		int Asum = 0; //そう得票
		int yes =0;
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
			Asum  += A[i];
		}
		for (int i = 0; i < A.length; i++) {
			if(A[i]>=Asum/(4*M)){
				yes++;
			}
		}
		if (yes>=M) {
			System.out.println("Yes");	
		} else {
			System.out.println("No");
		}
		sc.close();
    }
		
		
}