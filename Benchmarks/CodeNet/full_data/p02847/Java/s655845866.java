import java.util.*;

class Main {
	Scanner sc;

	void calc() {
		sc = new Scanner(System.in);
		String d = sc.next();
		switch (d) {
		case "SUN":
			System.out.println(7);
			break;
		case "MON":
			System.out.println(6);
			break;
		case "TUE":
			System.out.println(5);
			break;
		case "WED":
			System.out.println(4);
			break;
		case "THU":
			System.out.println(3);
			break;
		case "FRI":
			System.out.println(2);
			break;
		case "SAT":
			System.out.println(1);
			break;
		default:
			System.out.println(-1);
		}
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}