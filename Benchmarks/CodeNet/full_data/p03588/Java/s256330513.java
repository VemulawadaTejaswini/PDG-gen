import java.util.Scanner;
public class Main {
	public static void main(String args[]){
	    int cnt=0;
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int[][] A = new int[N][2];
		for(int i = 0;i<N;i++){
		    A[i][0] = sc.nextInt();
		    A[i][1] = sc.nextInt();
		}
		int tmp = A[0][0];
		for(int j = 0;j<N;j++){
		    if(A[j][0]>tmp){
		        tmp=j;
		        
		    }
		}
		int ans = A[tmp][1];
		while(ans!=0){
		    ans--;
		    cnt++;
		}

		System.out.println(cnt+A[tmp][0]);
		
	}
}