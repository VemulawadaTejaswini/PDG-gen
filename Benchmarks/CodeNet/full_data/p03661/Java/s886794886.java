import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main{
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("src/input.txt");
		//InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();
		int[] a = new int[N];
		int sunuke = 0;
		int arai = 0;

		for(int i = 0; i < N; i++){
			a[i] = sc.nextInt();
			if(i >= 1){
				arai += a[i];
			}else{
				sunuke += a[i];
			}
		}

		int min = Math.abs(sunuke-arai);
		for(int i = 1; i < N-1; i++){
			sunuke += a[i];
			arai -= a[i];

			if(min > Math.abs(sunuke-arai)){
				min = Math.abs(sunuke-arai);
			}else{
				break;
			}
		}
		System.out.println(min);
	}
}