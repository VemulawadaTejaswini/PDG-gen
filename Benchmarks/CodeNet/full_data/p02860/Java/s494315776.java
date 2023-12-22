import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
	int oddeven = r.length() % 2;
	int length = r.length();
	if (oddeven == 0) {
		String right = r.substring(length/2);
		String left = r.substring(0, (length)/2 );
		System.out.println(left +" "+right);
		if (left.equals(right)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	else {
		System.out.println("no");
	}
}
	}