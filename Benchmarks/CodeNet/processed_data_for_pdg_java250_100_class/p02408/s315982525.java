public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] card = new int[4][13];
		String mark;
		int num;
		int cnt;
		for (cnt = 0; cnt < input; cnt++) {
			mark = sc.next();
			num = sc.nextInt();
			switch (mark) {
			case "S":
				card[0][num - 1] = 1;
				break;
			case "H":
				card[1][num - 1] = 1;
				break;
			case "C":
				card[2][num - 1] = 1;
				break;
			case "D":
				card[3][num - 1] = 1;
				break;
			}
		}
		int left, right;
		for (left = 0; left <= 3; left++) {
			for (right = 0; right <= 12; right++) {
				if (card[left][right] == 0) {
					switch (left) {
					case 0:
						System.out.println("S " + (right+1));
						break;
					case 1:
						System.out.println("H " + (right+1));
						break;
					case 2:
						System.out.println("C " + (right+1));
						break;
					case 3:
						System.out.println("D " + (right+1));
						break;
					}
				}
			}
		}
		sc.close();
	}
}
