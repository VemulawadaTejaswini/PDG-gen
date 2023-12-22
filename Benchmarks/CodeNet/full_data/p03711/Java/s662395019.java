
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int[] num = new int[] {1, 2, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1};
	
	Scanner scan = new Scanner(System.in);
	int x = Integer.parseInt(scan.next());
	int y = Integer.parseInt(scan.next());

	String ans = (num[x] == num[y] ? "Yes" : "No");
	System.out.println(ans);
	
	scan.close();
    }
}
