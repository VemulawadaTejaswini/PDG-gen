import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int r = 0;
		for (int i = 1; i <= n; i++)
			if (in.nextInt() != i)
				r++;
		if (r <= 2)
			System.out.println("YES");
		else
			System.out.println("NO");
		in.close();
	}
}
