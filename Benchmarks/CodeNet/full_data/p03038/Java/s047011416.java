import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        SortedMap<Integer, Integer> histogram = new TreeMap<>();
        for(int i=0; i<n; i++) {
            int a = in.nextInt();
            if(histogram.containsKey(a)) {
                histogram.put(a, histogram.get(a)+1);
            }
            else {
                histogram.put(a, 1);
            }
        }
        SortedMap<Integer, Integer> replacements = new TreeMap<>();
        for(int i=0; i<m; i++) {
            int b = in.nextInt();
            int c = in.nextInt();
            if(replacements.containsKey(c)) {
                replacements.put(c, replacements.get(c)+b);
            }
            else {
                replacements.put(c, b);
            }
        }
        Iterator<Integer> it = replacements.keySet().iterator();
        while(it.hasNext()) {
            int c = it.next();
            int b = replacements.get(c);
            while(true) {
                int a = histogram.firstKey();
                if(a >= c) {
                    break;
                }
                int count = histogram.get(a);
                if(count<=0) {
                    histogram.remove(a);
                    continue;
                }
                int consumed = Math.min(count, b);
                int newCount = histogram.get(a)-consumed;
                histogram.put(a, newCount);
                if(newCount<=0) {
                    histogram.remove(a);
                }

                if(histogram.containsKey(c)) {
                    histogram.put(c, histogram.get(c)+consumed);
                }
                else {
                    histogram.put(c, consumed);
                }
                b -= consumed;
                if(b<=0) {
                    break;
                }
            }
        }

        long sum = 0;
        it = histogram.keySet().iterator();
        while(it.hasNext()) {
            int a = it.next();
            sum += (long)a * (long)histogram.get(a);
        }
        System.out.println(sum);
    }
}
