import java.util.HashMap;
import java.util.Scanner;

class Main{
	static long mod=1000000007; // 10e9 + 7
    // $a^x$ mod m
	static long pow(long a, long x, long m){
		if(x == 1) return a % m;
		else if(x % 2 == 0) return pow((a * a) % m, x / 2, m) % m;
		else return (a * pow((a * a) % m, x / 2, m)) % m;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(map.containsKey(A)) map.put(A, map.get(A) + 1);
			else map.put(A, 1);
		}
		boolean check = true;
		long ans = pow(2, (long)(N / 2), mod);
		if(N % 2 == 0) {
			for(int i = 1; i < N; i += 2) if(!map.containsKey(i) || map.get(i) != 2) check = false;
			System.out.println(check ? ans : 0);
		}else {
			check = (map.containsKey(0) && (map.get(0) == 1));
			for(int i = 2; i < N; i += 2) if(!map.containsKey(i) || map.get(i) != 2) check = false;
			System.out.println(check ? ans : 0);
		}
	}
}