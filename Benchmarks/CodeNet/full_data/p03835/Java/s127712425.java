import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int cnt=0;

		for(int x=0;x<=K;x++){
			for(int y=0;y<=(K-x);y++){
				int z=K-x-y;
				if(x+y+z==S) cnt++;
			}
		}

		System.out.println(cnt);
	}
}