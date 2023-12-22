import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String S = sc.next();
	String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	boolean bl = true;

	for (int i = 1; i < 7; i++) {
	    if (S.equals(day[i])) {
		System.out.println(7 - i);
		bl = false;
	    }
	}

	if (bl)
	    System.out.println(7);
    }
}