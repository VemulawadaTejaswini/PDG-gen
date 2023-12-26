public class Main{
	public static void main(String[] args) {
		int[][][] hoUse = new int[4][3][10];
		int building, floor, room, people;
		Scanner scAner = new Scanner(System.in);
		int info = scAner.nextInt();
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 10; k++)
					hoUse[i][j][k] = 0;
		for (int i = 0; i < info; i++) {
			building = scAner.nextInt();
			floor = scAner.nextInt();
			room = scAner.nextInt();
			people = scAner.nextInt();
			hoUse[building - 1][floor - 1][room - 1] += people;
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 10; k++) {
					System.out.print(" " + hoUse[i][j][k]);
				}
				System.out.println("");
			}
			if (i < 3)
				System.out.println("####################");
		}
	}
}
