import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Sushi> allQueue = new PriorityQueue<Sushi>(new Comparator<Sushi>() {
		    public int compare(Sushi s1, Sushi s2) {
		        return s2.value - s1.value;
		    }
		});
		for (int i = 0; i < n; i++) {
		    Sushi s = new Sushi(sc.nextInt(), sc.nextInt());
		    allQueue.add(s);
		}
		PriorityQueue<Sushi> changeQueue = new PriorityQueue<Sushi>(new Comparator<Sushi>() {
		    public int compare(Sushi s1, Sushi s2) {
		        return s1.value - s2.value;
		    }
		});
		long value = 0;
		HashSet<Integer> types = new HashSet<>();
		for (int i = 0; i < k; i++) {
		    Sushi s = allQueue.poll();
		    value += s.value;
		    if (types.contains(s.type)) {
		        changeQueue.add(s);
		    } else {
		        types.add(s.type);
		    }
		}
		long max = value + (long)types.size() * (long)types.size();
		while (allQueue.size() > 0) {
		    Sushi s = allQueue.poll();
		    if (!types.contains(s.type) && changeQueue.size() > 0) {
		        Sushi change = changeQueue.poll();
		        value -= change.value;
		        value += s.value;
		        types.add(s.type);
		        max = Math.max(max, value + (long)types.size() * (long)types.size());
		    }
		}
	    System.out.println(max);
   }
   
   static class Sushi {
       int type;
       int value;
       
       public Sushi(int type, int value) {
           this.type = type;
           this.value = value;
       }
   }
}


