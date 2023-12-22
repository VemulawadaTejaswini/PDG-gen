import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		//int[] tasks = new int[N];
		//int[] deadLines = new int[N];
		//boolean[] isFinished = new boolean[N];


		//TreeMap<Integer, Integer> map = new TreeMap<>();
		List<Task> tasks = new  ArrayList<>();

		for (int i = 0; i < N; i++) {


			int A = s.nextInt();
			int B = s.nextInt();

			tasks.add(new Task(A, B));


			/*
			if(map.containsKey(B)) {
				map.put(B, map.get(B) + A);
			}else {
				map.put(B, A);
			}
			*/

		}

		tasks.sort(new Comparator<Task>() {
			@Override
			public int compare(Task o1, Task o2) {
				return o1.deadline - o2.deadline;
			}
		});


		int taskSum = 0;
		for(Task task : tasks) {
			taskSum += task.time;
			if(taskSum > task.deadline) {
				System.out.println("No");
				return;
			}
		}
		/*
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {

			System.out.println(entry);
			taskSum += entry.getValue();
			if(taskSum > entry.getKey()) {
				System.out.println("No");
				return;
			}
		}
		*/

		System.out.println("Yes");

	}



	/*
	public static int getMinIndex(int[] array, boolean[] isFinished ) {

		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0;i<array.length;i++) {

			if(isFinished[i]) continue;

			if(array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}

		return minIndex;

	}*/
}

class Task {
	int time;
	int deadline;
	public Task(int time, int deadline) {
		super();
		this.time = time;
		this.deadline = deadline;
	}



}
