import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Work[] works = new Work[n];
		for (int i = 0; i < n; i++) {
		    works[i] = new Work(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(works, new Comparator<Work>() {
		    public int compare(Work w1, Work w2) {
		        if (w1.day == w2.day) {
		            return w2.money - w1.money;
		        } else {
		            return w2.day - w1.day;
		        }
		    }
		});
		PriorityQueue<Work> queue = new PriorityQueue<>(new Comparator<Work>() {
		    public int compare(Work w1, Work w2) {
		        return w1.money - w2.money;
		    }
		});
		int day = 0;
		for (int i = 0; i < n; i++) {
		    if (day + works[i].day <= m) {
		        queue.add(works[i]);
		        day++;
		    } else if (day + works[i].day == m + 1) {
		        if (queue.size() > 0 && queue.peek().money < works[i].money) {
		            queue.poll();
		            queue.add(works[i]);
		        }
		    }
		}
		long ans = 0;
		while (queue.size() > 0) {
		    ans += queue.poll().money;
		}
		System.out.println(ans);
   }
   
   static class Work {
       int day;
       int money;
       
       public Work(int day, int money) {
           this.day = day;
           this.money = money;
       }
       
       public String toString() {
           return day + ":" + money;
       }
   }
}
