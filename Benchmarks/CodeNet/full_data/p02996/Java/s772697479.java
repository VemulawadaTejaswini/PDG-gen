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

			int n = Integer.parseInt(scanner.nextLine());
			Queue<Job> q = new PriorityQueue<>();
			for(int i = 0; i < n; i++) {
				q.add(new Job(scanner.nextInt(), scanner.nextInt()));
			}

			int sum = 0;
			for(int i = 0; i < n; i ++) {

				Job x = q.poll();
				sum += x.cost;
				if(sum > x.limit) {

					System.out.println("No");
					return;
				}

			}

			System.out.println("Yes");
		}
		public static class Job implements Comparable<Job>{

			int limit, cost;

			public Job(int cost, int limit) {

				this.limit = limit;
				this.cost = cost;
			}

			@Override
			public int compareTo(Job another) {

				return this.limit - another.limit;
			}

		}

	}