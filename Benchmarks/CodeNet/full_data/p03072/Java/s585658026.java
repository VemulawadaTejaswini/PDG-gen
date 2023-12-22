import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
		}
		int cnt = 1;
		int max = h[0];
		for(int i = 0;i < n-1;i++){
			if(max <= h[i+1]){
				cnt++;
				max = h[i+1];
			}
		}
		System.out.println(cnt);
	}
}