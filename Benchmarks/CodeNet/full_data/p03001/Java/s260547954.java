	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.Set;

	public class Main{

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			String[] t = scanner.nextLine().split(" ");
			long w = Long.parseLong(t[0]);
			long h = Long.parseLong(t[1]);
			double m = w * h / 2.0;
			long x = Long.parseLong(t[2]);
			long y = Long.parseLong(t[3]);

			int ans = w == x * 2 && h == y * 2 ? 1 : 0;

			System.out.println(m + " " + ans);
		}
	}