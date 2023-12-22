import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//C
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList<Integer> x = new ArrayList<>();
		int[] dis = new int[N];
		int D  = 1;

		if(N == 1){
			System.out.println(Math.abs(X-sc.nextInt()));
			return;
		}
		x.add(X);
		for(int i = 0 ; i < N ; i++){
			x.add(sc.nextInt());
		}
		Collections.sort(x);

		for(int i = 0 ; i < N ; i++){
			dis[i] = x.get(i+1) - x.get(i);
			//System.out.println(i+":"+dis[i]);
		}

		D = dis[0];
		for(int distance : dis){
			//System.out.println(distance);
			D = gcd(D,distance);
		}
		System.out.println(D);
	}

	public static int gcd(int p,int q){
		int tmp;
		int a;
		int b;
		if(p < q){
			a = q;
			b = p;
		}else{
			a = p;
			b = q;
		}
		//System.out.println(a+":"+b+"");
		while((tmp = a % b) != 0){
			a = b;
			b = tmp;
		}
		return b;
	}
}