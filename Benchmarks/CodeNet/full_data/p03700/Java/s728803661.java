
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] hps = new int[n];
        int maxHp = 0;
      	long res = 0;
      	
      	for (int i = 0; i < n; i++) {
      		int hp = sc.nextInt();
      		hps[i] = hp;
      		maxHp = Math.max(maxHp, hp);
      	}
      	
      	long left = 0;
      	long right = (maxHp / b);
      	while (left <= right) {
      		long middle = (left + right ) / 2;
      		if (isEnough(middle, hps, a, b)) {
      			// 在middle回以內的爆炸可以消掉怪獸，因此找更小的
      			// middle回以内の爆発で　全ての怪獣を消すことができる。
      			// もっと　小さいmiddleを求める。
      			left = middle + 1;
      		} else {
      			right = middle - 1;
      		}
      	}
      	System.out.println(left);
	}
	
	// 可以在t回內打死所有怪獸嗎？
	// t回以内の爆発で　全ての怪獣を消すことができるか?
	private static boolean isEnough(long t, int[] hps, int a, int b) {
		long times = 0;
		for (int hp: hps) {
			if (hp > b*t) {
				times += (int)Math.ceil((hp*1.0 - b*t) / (double)(a - b));
			}
		}
		return times > t;
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
