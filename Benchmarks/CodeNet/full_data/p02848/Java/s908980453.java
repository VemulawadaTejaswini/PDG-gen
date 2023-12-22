import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final Map<String, Integer> cnt = new HashMap<>();
        {
            cnt.put("SUN", 7);
            cnt.put("MON", 6);
            cnt.put("TUE", 5);
            cnt.put("WED", 4);
            cnt.put("THU", 3);
            cnt.put("FRI", 2);
            cnt.put("SAT", 1);
        };


        int shift = in.nextInt();
        StringBuilder s = new StringBuilder(in.next());
        for (int i = 0; i < s.length(); ++i) {
            char newChar = (char)(s.charAt(i) + shift);
            if (newChar > 'Z') {
                newChar -= 'Z';
                newChar += ('A' - 1);
            }
            s.setCharAt(i, newChar);
        }
        out.println(s.toString());

        in.close();
        out.close();
    }
    static class Pair {
	  		public long first;
	  		public long second;

	  		public Pair() {
	  			this(0, 0);
	  		}

	  		public Pair(final long first, final long second) {
	  			this.first = first;
	  			this.second = second;
	  		}
	  	}
}
