
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] list = sc.next().toCharArray();
		int red = 0;
		int blue = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == '0') {
				red++;
			} else {
				blue++;
			}
		}
		System.out.println(Math.min(red, blue) * 2);
	}

}
