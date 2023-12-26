public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int first = sc.nextInt();
			int mid = sc.nextInt();
			int re = sc.nextInt();
			String ach;
			if(first == -1 && mid == -1 && re == -1) break;
			int sumPoint = first + mid;
			if(first == -1 || mid == -1 || (sumPoint) < 30) {
				ach = "F";
			} else if((sumPoint) >= 80) {
				ach = "A";
			} else if((sumPoint) >= 65) {
				ach = "B";
			} else if((sumPoint) >= 50) {
				ach = "C";
			} else {
				if(re >= 50) {
					ach = "C";
				} else {
					ach = "D";
				}
			}
			System.out.println(ach);
		}
	}
}
