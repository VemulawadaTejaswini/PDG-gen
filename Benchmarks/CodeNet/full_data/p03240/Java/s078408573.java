import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a[] = new int [N];
		int b[] = new int [N];
		int h[] = new int [N];

		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int H = 0;
		int Cx = 0;
		int Cy = 0;

		boolean flag = false;

		for(int cx = 0; cx <= 100; cx++) {
			for(int cy = 0; cy <= 100; cy++) {
				flag = false;
				int index = 0;
				for(int i = 0; i < N; i++){
					if(h[i] != 0){
						index = i;
					}
				}
				H = h[index] + Math.abs(a[index]-cx) + Math.abs(b[index]-cy);
				for(int i = 0; i < N; i++) {
					if(h[i] != Math.max(H - Math.abs(b[i]-cx) - Math.abs(b[i]-cy), 0)) {
						flag = true;
						break;
					}
				}
				if(flag == false) {
					Cy = cy;
					break;
				}
			}
			if(flag == false) {
				Cx = cx;
			}
		}
		System.out.println(Cx +" "+ Cy +" "+ H);
		sc.close();
	}

}