import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int max = 0;
		Que.init(k);
		for(int i=0;i<n;i++) {
			Que.add(sc.nextInt());
			max = Math.max(max, Que.sum());
		}
		System.out.println((double)(max+k)/2);
	
	}

}

class Que {
	static int a[];
	public static void init(int n) {
		a = new int[n];
	}
	
	public static void add(int n) {
		for(int i=0;i<a.length-1;i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = n;
	}
	
	public static int sum() {
		return java.util.Arrays.stream(a).sum();
	}
}
