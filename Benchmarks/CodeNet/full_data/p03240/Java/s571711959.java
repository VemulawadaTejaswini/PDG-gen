import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		for (int posX = 0; posX <= 100; posX++) {
			for (int posY = 0; posY <= 100; posY++) {
				
				int H = -1;
				for (int i = 0; i < N; i++) {
					if (h[i] == 0) continue;
					
					if (H == -1) {
						H = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i]);
					}
					else {
						int tmp = h[i] + Math.abs(posX - x[i]) + Math.abs(posY - y[i]);
						if (tmp != H) {
							H = -2;
							break;
						}
					}
				}
				
				if (H == -2) continue;
				
				for (int i = 0; i < N; i++) {
					if (h[i] != 0) continue;
					
					int tmp = H - Math.abs(posX - x[i]) - Math.abs(posY - y[i]);
					if (tmp > 0) {
						H = -2;
						break;
					}
				}
				
				if (H == -2) continue;
				
				System.out.println(posX + " " + posY + " " + H);
			}
		}

	}

}