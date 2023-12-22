
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Task[] tasks = new Task[n];
		
		for(int i = 0; i < n; i++) {
			String[] tmpArray = br.readLine().split(" ");
			
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			
			tasks[i] = new Task(i, a, b);
		}
		
		Arrays.sort(tasks);
		
		long currentTime = 0;
		for(int i = 0; i < n; i++) {
			if(currentTime > tasks[i].beginLimit) {
				System.out.println("No");
				return;
			}
			
			currentTime += tasks[i].length;
			
//			System.out.println("task "+tasks[i].id + " finished : "+currentTime);
		}
		
		System.out.println("Yes");
	}

}

class Task implements Comparable<Task> {
	int id;
	int length;
	int deadLine;
	int beginLimit;
	
	Task(int id, int length, int deadLine){
		this.id = id;
		this.length = length;
		this.deadLine = deadLine;
		this.beginLimit = deadLine - length + 1;
	}

	@Override
	public int compareTo(Task t) {
		// TODO Auto-generated method stub
//		return this.beginLimit - t.beginLimit;
		return this.deadLine - t.deadLine;
	}
	
	
}