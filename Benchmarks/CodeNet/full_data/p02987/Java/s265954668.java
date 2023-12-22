
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split("");


		if(lines[0].equals(lines[1])) {
			if(lines[2].equals(lines[3])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else if(lines[0].equals(lines[2])) {
			if(lines[1].equals(lines[3])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else if(lines[0].equals(lines[3])) {
			if(lines[1].equals(lines[2])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
	}

}
