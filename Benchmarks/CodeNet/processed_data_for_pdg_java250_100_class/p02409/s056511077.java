public class Main {
	public static void main(String[] args) {
		int[][][] house = new int[4][3][10];
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0; i < num; i++){
			int build = in.nextInt();
			int floor = in.nextInt();
			int room = in.nextInt();
			int count = in.nextInt();
			house[build - 1][floor - 1][room - 1] += count;
		}
		int i = 0;
		int j = 0;
		int k = 0;
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				for(k = 0; k < 9; k++) {
					System.out.print(" " + house[i][j][k]);
				}
				System.out.println(" " + house[i][j][k]);
			}
			if(i < 3) {
				for(int l = 0; l < 20; l++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
	}
}
