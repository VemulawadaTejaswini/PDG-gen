import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum =0;
		int[] A= new int[N+1];
		A[0] = 0;
		for(int j=1;j<=N;j++) {
			A[j]=sc.nextInt();
		}
		for(int i=1;i<=N;i++) {
			for(int k=1;k<=N;k++) {
			if (k==i) {
				break;
			}else if(k==i+1){
				sum += Math.abs(A[k]-A[k-2]);
			}else {
				sum += Math.abs(A[k]-A[k-1]);
			}
			}
			System.out.println(sum);
		}
	}
}
