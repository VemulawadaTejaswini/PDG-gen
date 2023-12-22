import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int a = Integer.parseInt(String.valueOf(n).substring(0,1));
		int atama = 0;
		for(int i = 0; i < 3; i++) {

			atama += a * (int)Math.pow(10, i);
		}

		boolean flg = true;

		if(atama < n) {

			a++;
			atama = 0;
			for(int i = 0; i < 3; i++) {

				atama += a * (int)Math.pow(10, i);
			}

		}

		System.out.println(atama);
	}

}