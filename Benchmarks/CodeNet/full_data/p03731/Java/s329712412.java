import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T = sc.nextLong();
		long t[] = new long[N+1];
		
		for(int i=1; i<=N; i++){
			t[i]=sc.nextLong();
		}
		
		long time=T;
		
		for(int i=2; i<=N; i++){
			if(t[i]-t[i-1]<=T){
				time = time + t[i]-t[i-1];
			}
			else time = time + T;
		}
		System.out.println(time);

	}
}