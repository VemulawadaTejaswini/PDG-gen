import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] spl = sc.nextLine().split(" ");
		long[] h = new long[N];
		for(int i = 0;i < N;i++){
			h[i] = Long.parseLong(spl[i]);
		}
		sc.close();
		if(h.length > 1){
			for(int i = 1;i < N-1;i++){
				if(h[i] - h[i-1] > 1 && h[i+1] - h[i] < 0){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}