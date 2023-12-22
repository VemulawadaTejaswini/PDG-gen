import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		for(int i = 0;i<input.length();i++) {
			if(i%2==0&&arr[i]!='R'&&arr[i]!='U'&&arr[i]!='D') {
				System.out.println("No");
				return;
			}else if(i%2!=0&&arr[i]!='L'&&arr[i]!='U'&&arr[i]!='D') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");

	}

}
