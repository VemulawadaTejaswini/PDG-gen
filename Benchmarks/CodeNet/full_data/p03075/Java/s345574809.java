import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		int[] cod = new int[5];
		int[] dist = new int[10];
		
		for (int i = 0; i < 5; i++) {
			cod[i] = stdIn.nextInt();
		}
		int k = stdIn.nextInt();
		
		dist[0] = cod[0] - cod[1];
		dist[1] = cod[0] - cod[2];
		dist[2] = cod[0] - cod[3];
		dist[3] = cod[0] - cod[4];
		dist[4] = cod[1] - cod[2];
		dist[5] = cod[1] - cod[3];
		dist[6] = cod[1] - cod[4];
		dist[7] = cod[2] - cod[3];
		dist[8] = cod[2] - cod[4];
		dist[9] = cod[3] - cod[4];
		
		for (int i = 0; i < 10; i++) {
			if (dist[i] < 0) {
				dist[i] *= -1;
			}
			if (dist[i] > k) {
				System.out.println(":(");
				return;
			}
		}
		
		System.out.println("Yay!");
	
	}
}