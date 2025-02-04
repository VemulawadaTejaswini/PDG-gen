import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int ai: a){
			if(ai < min){
				min = ai;
			}
			if(max < ai){
				max = ai;
			}
		}
		System.out.println(max-min);
	}

}
