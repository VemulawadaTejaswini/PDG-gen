import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int lines = Integer.parseInt(in);
		int [] points = new int[lines];
		boolean [] resArray = new boolean [lines];
		for (int i = 0; i < lines;i++) {
			String line = sc.nextLine();
			int a = Integer.parseInt(line);
			points[i] = a;
			resArray[i] =true;
		}
		int total = sum(points,resArray);
		if (judge(total)) {
			System.out.println(total);
		} else {
			int a = upCount(points,resArray);
			int b = downCount(points,resArray);
			if (a > b){
				System.out.println(a);
			} else {
				System.out.println(b);

			}
		}


		sc.close();
	}

	private static int sum (int[] points,boolean[] res) {
		int ans = 0;
		for (int i = 0 ; i < points.length; i++) {
			if (res[i]){
				ans = ans + points[i];
			}
		}

		return ans;
	}

	private static boolean judge (int in) {
		if (in % 10 == 0) {
			return false;
		} else {
			return true;
		}
	}

	private static int upCount(int[] points,boolean[] res){
		int ans = 0;
		for (int i = 0; i < points.length; i++) {
			res[i] = false;
			int wkans = sum(points,res);
			if ((ans <= wkans) && (judge(wkans))) {
				ans = wkans;
			}
		}
		return ans;
	}

	private static int downCount(int[] points,boolean[] res){
		int ans = 0;
		for (int i = (points.length - 1); i >= 0; i--) {
			res[i] = false;
			int wkans = sum(points,res);
			if ((ans <= wkans) && (judge(wkans))) {
				ans = wkans;
			}
		}
		return ans;

	}

}