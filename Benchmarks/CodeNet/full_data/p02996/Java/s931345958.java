import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Task[] tasks;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tasks = new Task[n];
		for(int i = 0; i < n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			tasks[i] = new Task(a, b);
		}
		Arrays.sort(tasks);
		boolean bool = true;
		long time = 0;
		for(int i = 0; i < n; i++){
			time += tasks[i].time;
			if(time > tasks[i].limit){
				bool = false;
				break;
			}
		}
		System.out.println(bool ? "Yes" : "No");
	}
}
class Task implements Comparable<Task>{
	long time;
	long limit;
	Task(long a, long b){
		time = a;
		limit = b;
	}
	@Override
	public int compareTo(Task t) {
		return (int) (this.limit - t.limit);
	}
}
