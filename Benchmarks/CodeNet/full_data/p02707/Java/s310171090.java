import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
                int[] A = new int[N+1];
                int[] cnt = new int[N+1];
                A[1]=0;
                for(int i=2; i<=N; i++){
                    A[i] = scan.nextInt();
                            cnt[A[i]]++;
                }
                
                for(int i=1; i<=N; i++){
                    System.out.println(cnt[i]);
                }
	}
}