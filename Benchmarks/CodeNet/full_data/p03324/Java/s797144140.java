import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		int sum=1;
		if(D==0){
			System.out.println(N);
		}
		else if(D==1||D==2) {
			for(int i =0;i<D;i++) {
				sum*=100;
			}
			int ans = sum*N;
			System.out.println(ans);
		}
	}
}
