import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] city = new int[N];
		for(int i = 0 ; i < N ; i++){
			city[i] = Math.abs(X-sc.nextInt());
		}
		sc.close();



		int tmp = city[0];
		for(int i = 0 ; i <N ; i++){
			tmp = getgcd(tmp,city[i]);
			if(tmp == 1){
				break;
			}
		}
		System.out.println(tmp);

	}
	public static int getgcd(int m, int n) {
	    if(m < n) return getgcd(n, m);
	    if(n == 0) return m;
	    return getgcd(n, m % n);
	}
}

