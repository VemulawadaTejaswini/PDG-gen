import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] num = new int[N];
		int a = 0;      
		for( int i=0; i<N; i++ ){
			num[i] = sc.nextInt();
			a+=num[i];
		}
		int a1 = a/N;
		int a2 = a/N+1;      
		int ans1 = 0;
		int ans2 = 0;      
		for( int i=0; i<N; i++ ){
			ans1 = ans1 + (num[i]-a1)*(num[i]-a1);
		}
		for( int i=0; i<N; i++ ){
			ans2 = ans2 + (num[i]-a2)*(num[i]-a2);          
        }          
		System.out.println(Math.min(ans1,ans2));
	}
}
