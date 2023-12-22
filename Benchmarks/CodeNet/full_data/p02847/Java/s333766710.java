import java.util.Scanner;

public class Main {
	static int p[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] wd = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

		int i = 0;
		while(!wd[i].equals(s))
			i += 1;

		int ans = 7 - i;

		System.out.println(ans);
        return;
    }
}

