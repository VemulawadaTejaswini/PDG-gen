import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		Integer v[]=new Integer[3];
		for(int i=0; i<3; i++) v[i]=sc.nextInt();
		Arrays.sort(v, (x,y)->Integer.compare(y, x));

		int cnt=0;
		cnt += v[0]-v[1];
		v[1]+=cnt;
		v[2]+=cnt;
		if((v[0]-v[2])%2==0) {
			cnt +=(v[0]-v[2]+1)/2;
		} else {
			cnt +=(v[0]-v[2]+1)/2+1;
		}
		System.out.println(cnt);

		sc.close();
	}
}
