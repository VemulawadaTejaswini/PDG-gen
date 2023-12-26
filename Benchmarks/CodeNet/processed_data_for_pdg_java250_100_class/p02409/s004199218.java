public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dorm[][][] = new int[4][3][10];
		for(int b=0; b<4; b++) {
			for(int f=0; f<3; f++) {
				for(int r=0; r<10; r++) {
					dorm[b][f][r] = 0;
				}
			}
		}
		for(int i=0; i<n; i++){
			int building = sc.nextInt();
			int floor = sc.nextInt();
			int room = sc.nextInt();
			int count = sc.nextInt();
			dorm[building-1][floor-1][room-1] += count;
		}
		sc.close();
		for(int b=0; b<4; b++) {
			for(int f=0; f<3; f++) {
				for(int r=0; r<10; r++) {
					System.out.print(" " + dorm[b][f][r]);
				}
				System.out.println("");
			}
			if(b!=3) System.out.println("####################");
		}
	}
}
