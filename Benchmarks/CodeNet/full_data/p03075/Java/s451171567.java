import java.util.Scanner;

public class Main {
	static int Ante[] = new int[5];
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)Ante[i] = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.close();

		String res = "Yay!";
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(Ante[j]-Ante[i]>k) {
					res = ":(";
				}
			}
		}

		System.out.println(res);
	}

}
