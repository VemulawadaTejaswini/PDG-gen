import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sq = (int)Math.sqrt((double)N);
		if((A+B>N+1) || (A<sq && B<sq)) System.out.println(-1);
		else if(A+B==N+1){
			for(int i=B;i<=N;++i) System.out.print(i+" ");
			for(int i=B-1;i>=1;--i) System.out.print(i+" ");
			System.out.println();
		}else{
			for(int i=1;i<=N/B;i++){
				for(int j=i*B;j>(i-1)*B;j--){
					System.out.print(j+" ");
				}
			}
			for(int j=N;j>B*(N/B);--j) System.out.print(j+" ");
			System.out.println();
		}
		return;
	}
}