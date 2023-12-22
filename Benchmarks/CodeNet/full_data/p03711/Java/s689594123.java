import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int[] group1 = {1,3,5,7,8,10,12};
		int[] group2 = {4,6,9,11};
		if(checkSameGroup(x, y, group1)) {
			System.out.println("Yes");
		}else if(checkSameGroup(x, y, group2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	static public boolean checkSameGroup(int x, int y, int[] group) {
		boolean sameX = false,sameY = false;
		for (int i : group) {
			if(i == x) sameX = true;
			if(i == y) sameY = true;
		}

		if(sameX && sameY) return true;
		return false;
	}
}
