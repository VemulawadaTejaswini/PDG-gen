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
			long l = Long.parseLong(t[0]);
			long r = Long.parseLong(t[1]);

			long d = r - l;

			long min = Integer.MAX_VALUE;

			for(int i = 0; i <= d; i++) {

				min = Math.min(min, ((i + l) % 2019) * ((i + l + 1) % 2019));

			}

			System.out.println(min);

		}
	}