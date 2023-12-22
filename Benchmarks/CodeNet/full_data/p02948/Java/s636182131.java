
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int m = Integer.parseInt(tmpArray[1]);

		Job jobs[] = new Job[n];

		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			jobs[i] = new Job(a, b);
		}

		Arrays.sort(jobs);
		//debug
//		for(int i = 0; i < n; i++){
//			System.out.println(jobs[i].date + " "+ jobs[i].salary);
//		}

		int currentIndex = 0;
		long result = 0;
		PriorityQueue<Job> pq = new PriorityQueue<Job>(new Comparator<Job>() {

			@Override
			public int compare(Job o1, Job o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o2.salary - o1.salary;
			}
		});
		for(int i = 1; i <= m; i++){
//			System.out.println("i =  "+i);

			for(; currentIndex < n; currentIndex++){
				if(jobs[currentIndex].date > i){
					break;
				}
				else {
					pq.add(jobs[currentIndex]);
//					System.out.println("add jobs["+currentIndex+"]");
				}
			}

			Job top = pq.poll();
			if(top != null){
				result += top.salary;
			}
		}

		System.out.println(result);
	}

}

class Job implements Comparable<Job>{
	int date;
	int salary;

	Job (int date, int salary){
		this.date = date;
		this.salary = salary;
	}

	@Override
	public int compareTo(Job j) {
		return  this.date == j.date ? (j.salary - this.salary) : this.date - j.date;
	}


}