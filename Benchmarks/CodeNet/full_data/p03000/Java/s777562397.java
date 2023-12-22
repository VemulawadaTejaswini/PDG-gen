import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt()+1;
		int X = sc.nextInt();
		int[] L = new int[N];
		int count=1;		
		L[0]=0;
		
		for(int i=1;i<N;i++) {
			L[i]=sc.nextInt()+L[i-1];
			if(L[i]<=X) {
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
