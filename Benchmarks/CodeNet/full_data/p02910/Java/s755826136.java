import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String temp = scanner.nextLine();
		char[] list = temp.toCharArray();
		int flag  = 0;

		for(int i = 1; i <= list.length; i++) {

			if(i % 2 == 0) {
					if(list[i - 1] == 'L' || list[i - 1] == 'U' || list[i - 1] == 'D') {
					}else {flag++; break;}
			}else {

					if(list[i - 1] == 'R' || list[i - 1] == 'U' || list[i - 1] == 'D') {
					}else {flag++; break;}
				}
		}

		if(flag == 0) {
			System.out.println("Yes");
		}else System.out.println("No");

	}

}
