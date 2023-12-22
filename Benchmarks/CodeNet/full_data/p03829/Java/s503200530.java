import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int[] city = new int[n];

		for(int i=0;i<n;i++)city[i] = Integer.parseInt(sc.next());
		sc.close();
		long cnt = 0;
		for(int i=0;i<n-1;i++) {
			if((city[i+1]-city[i])*a<b) {
				cnt+=(city[i+1]-city[i])*a;
			}else {
				cnt+=b;
			}
		}
		System.out.println(cnt);
	}

}
