import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String[] hyozyun = br.readLine().split(" ");
			int A =Integer.parseInt(hyozyun[0]);
			int B =Integer.parseInt(hyozyun[1]);
			int C =Integer.parseInt(hyozyun[2]);
			int X =Integer.parseInt(hyozyun[3]);
			int Y =Integer.parseInt(hyozyun[4]);
			int sum = 0;
			if (A + B < 2 * C) {
				sum = A * X + B * Y;
			} else {
				
					if (X > Y) {
						sum = C * 2 * Y + (X - Y) * A;
					} else {
						sum = C * 2 * Y + (Y - X) * B;
					}
				
			}
			int compare = 0;
			if (X > Y) {
				compare = X * C * 2;
			} else {
				compare = Y * C * 2;
			}
			if (sum > compare) {
				sum = compare;
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}