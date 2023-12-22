import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] spl = sc.nextLine().split(" ");
		int[] h = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = Integer.parseInt(spl[i]);
		}
		sc.close();

		int[] d = new int[100010];
		for(int i = 0;i < N - 1;i++){
			d[i] = h[i+1] - h[i];
		}
		for(int i = 0;i < N - 1;i++){
			if(d[i] < -1){
				break;
			}
		}
		System.out.println("Yes");
	}
}