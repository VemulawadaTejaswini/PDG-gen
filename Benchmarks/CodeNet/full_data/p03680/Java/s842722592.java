import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt() - 1;
		}
		
		int answer = 0;
		int nowPoint = 0;
		
		while(nowPoint + 1 != 2){
			int prePoint = nowPoint;
			nowPoint = a[nowPoint] ;
			a[prePoint] = -1;
			answer++;
			//System.out.println("ans " + answer);
			if(nowPoint == -1){
				answer = -1;
				break;
				//System.out.println("out");
			}
		}
		
		System.out.println(answer);

	}
}