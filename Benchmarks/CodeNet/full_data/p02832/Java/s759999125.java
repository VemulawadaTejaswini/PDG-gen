
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String b = sc.nextLine();
		String[] c = b.split(" ");
		int i = 0;
		int j = 1;
		for(String d:c) {
			if(Integer.parseInt(d)==j) {
				j++;
				continue;
			}
			i++;
		}
		if(i==c.length) {i=-1;}
		System.out.println(i);
	}
}
