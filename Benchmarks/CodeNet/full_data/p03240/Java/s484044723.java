import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		int h[] = new int[N];
		for (int i=0;i<N;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		for (int X=0;X<=100;X++) {
			for (int Y=0;Y<=100;Y++) {
				int temp =0;
				boolean b = true;
				for (int i=0;i<N;i++) {
					int t = Math.abs(X-x[i])+Math.abs(Y-y[i])+h[i];
					if (h[i]>0) {
						if (temp==0) {
							temp =t;
						} else {
							if (t!= temp) {
								b = false;
								break;
							}
						}
					} else {
						if (temp==0) {
							temp =1;
						} else {
							if (1!= temp) {
								b = false;
								break;
							}
						}
					}
				}
				if (b==true) {
					System.out.println(X+" "+Y+" "+temp);
				}
			}
		}
	}
}