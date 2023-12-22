import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		String s = sc.next();
		
		String[] list =new String [s.length()];
		
		list = s.split("");
		boolean flag = true;
		
		for (int index=0; index<s.length(); index++) {
			if (index%2==1) {
				if (list[index].equals("R")) {
					flag=false;
				}
			} else {
				if (list[index].equals("L")) {
					flag=false;
				}
			}
		}
		
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}