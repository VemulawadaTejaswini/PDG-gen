import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];

		for (int i=0; i<N; i++){
			p[i] = sc.nextInt();
		}

		if (judge(p)){
			System.out.println("YES");
			return;
		}

		for (int i=0; i<N; i++){
			for (int j=i+1; j<N; j++){
				if (p[i] > p[j]){
					if (judge(swap(i, j, p))){
						System.out.println("YES");
						return;
					}
				}
			}
		}
		System.out.println("NO");
	}

	public static boolean judge(int[] p){
		boolean result = true;
		for (int i=0; i<p.length-1; i++){
			if (p[i] > p[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}

	public static int[] swap(int a, int b, int[]p){
		int result[] = p.clone();
		result[a] = p[b];
		result[b] = p[a];
		return result;
	}

}