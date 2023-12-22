import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String SArray[] = S.split("");
		int count = 0;

		for(int i = 0; i < S.length(); i++) {
			if (SArray[i].equals("1")){
				count++;
			}
		}

		System.out.println(count);
	}

}
