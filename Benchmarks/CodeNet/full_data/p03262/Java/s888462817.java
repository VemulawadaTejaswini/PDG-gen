import java.util.Scanner;
import java.lang.Math;
public class Main {
	public static int gcd(int a, int b){
		if(a == -1){
			return b;
		}

		while(b != 0){
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();

		int[] cities = new int[n];
		int res = -1;

		cities[0] = sc.nextInt();
		for(int i = 0; i < n - 1; i++){
			cities[i + 1] = sc.nextInt();
			if(cities[i] < x && x < cities[i + 1]){
				res = gcd(res, x - cities[i]);
				res = gcd(res, cities[i + 1] - x);
			} else {
				res = gcd(res, cities[i + 1] - cities[i]);
			}
		}

		if(x < cities[0]){
			res = gcd(res, cities[0] - x);
		}
		if(cities[n - 1] < x){
			res = gcd(res, x - cities[n - 1]);
		}

		System.out.println(res);
	}
}