import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Job[] jobs = new Job[n];
		for (int i = 0; i < n; i++) {
		    jobs[i] = new Job(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(jobs);
		TreeMap<Integer, Integer> map = new TreeMap<>();
		int idx = 0;
		long total = 0;
		for (int i = 0; i < m; i++) {
		    while (idx < n) {
		        if (m - i >= jobs[idx].day) {
		            total += jobs[idx].money;
		            int day = m - i - jobs[idx].day;
		            if (map.containsKey(day)) {
		                map.put(day, map.get(day) + 1);
		            } else {
		                map.put(day, 1);
		            }
		            idx++;
		            break;
		        } else {
		            Integer x = map.ceilingKey(jobs[idx].day - m + i);
		            if (x == null) {
		                idx++;
		            } else {
		                if (map.get(x) == 1) {
		                    map.remove(x);
		                } else {
		                    map.put(x, map.get(x) - 1);
		                }
		                total += jobs[idx].money;
		                idx++;
		                break;
		            }
		        }
		    }
		}
		System.out.println(total);
   }
   
   static class Job implements Comparable<Job> {
       int day;
       int money;
       
       public Job(int day, int money) {
           this.day = day;
           this.money = money;
       }
       
       public int compareTo(Job another) {
           return another.money - money;
       }
   }
}
