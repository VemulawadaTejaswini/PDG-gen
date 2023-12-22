import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("");
		long bcount = 0;
		long count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("B")) {
				bcount++;
			} else {
				count = count + bcount;
			}
		}
		System.out.println(count);
	}
}