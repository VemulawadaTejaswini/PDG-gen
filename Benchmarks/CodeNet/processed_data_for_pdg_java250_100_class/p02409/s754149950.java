public class Main {
	public static void main(String[] args) {
		int[][][] house = new int[4][3][10];
		int build = 0;
		int floor = 0;
		int room = 0;
		int count = 0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i = 0; i < num; i++){
			build = in.nextInt();
			floor = in.nextInt();
			room = in.nextInt();
			count = in.nextInt();
			for(int j = 0; j < 4; j++) {
				if(build != j + 1) {
					continue;
				}
					for(int k = 0; k < 3; k++) {
						if(floor != k + 1) {
							continue;
						}
							for(int l = 0; l < 10; l++) {
								if(room == l + 1) {
									house[j][k][l] += count;
									break;
								}
							}
						break;
					}
				break;
			}
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
