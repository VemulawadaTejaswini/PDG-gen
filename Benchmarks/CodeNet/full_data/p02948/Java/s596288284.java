
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) {
    FastReader sc = new FastReader();
    int n = sc.nextInt();
    int m = sc.nextInt();
    long res = 0;
    
    PriorityQueue<Work> pq = new PriorityQueue<>((a, b) -> (b.earn - a.earn));
    
    for (int i = 0; i < n; i++) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	Work w = new Work(a, b);
    	pq.offer(w);
    }
    int day = 0;
    while (day < m && !pq.isEmpty()) {
    	boolean isPicked = false;
    	List<Work> list = new ArrayList<>();
    	while (!isPicked && !pq.isEmpty()) {
    		Work w = pq.poll();
        	int spend = w.spend;
        	
        	if ((day + spend <= m)) {
        		res += w.earn;
        		isPicked = true;
        	} else {
        		list.add(w);
        	}
    	}
    	
    	for (int i = 0; i < list.size(); i++) {
    		pq.add(list.get(i));
    	}
    	day++;
    }
    
    System.out.println(res);
    
  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }
  
    String next() { 
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() { 
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
        try{
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
      }
  }
}

class Work {
	int spend;
	int earn;
	
	public Work(int spend, int earn) {
		this.spend = spend;
		this.earn = earn;
	}
}
