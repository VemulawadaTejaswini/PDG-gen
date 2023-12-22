import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int T[] = new int[n];
		int A[] = new int[n];
		
		for(int i=0;i<n;i++){
		    T[i] = sc.nextInt();
		    A[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
		    int t = T[i+1];
		    int a = A[i+1];
		    int j = 2;
		    while(T[i]>T[i+1]||A[i]>A[i+1]){
		        T[i+1]=t*j;
		        A[i+1]=a*j;
		        j++;
		    }
		}
		int num = T[n-1] + A[n-1];
		
		// 出力
		System.out.println(num);
    }
}
