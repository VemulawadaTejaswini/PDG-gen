import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		// 2020/2/4 No.148
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (sc.hasNextLine()) {
		    String str = sc.nextLine();
            if ("".equals(str)) {
                break;
            }
		    list.add(Integer.parseInt(str));
		}

		int A = list.get(0);
		int B = list.get(1);

		if((A == 1 && B == 2) || (A == 2 && B == 1))
			System.out.println(3);
		else if((A == 1 && B == 3) || (A == 3 && B == 1))
			System.out.println(2);
		else if((A == 2 && B == 3) || (A == 3 && B == 2))
			System.out.println(1);
	}
}