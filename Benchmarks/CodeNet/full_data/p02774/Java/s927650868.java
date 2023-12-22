import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        init();

        int n = nextInt();
        long k = nextInt();
        ArrayList<Long> a = new ArrayList<>();

        for (int i = 0; i < n; i++) a.add(nextLong());
        a.sort(Long::compareTo);
        lastOccurrence = new HashMap<>();
        for (int i = 0; i < a.size(); i++) {
            lastOccurrence.put(a.get(i), i);
        }

        long min = Math.min(a.get(0) * a.get(1), a.get(0) * a.get(a.size() - 1));
        long max = Math.max(a.get(0) * a.get(1), a.get(a.size() - 1) * a.get(a.size() - 2));

//        System.out.println(a);
//        System.out.println(numsLessThan(9, a));
        long mid = -1;
        while (max > min) {
            mid = (min + max) / 2;
            long numsLess = numsLessThan(mid, a);
            if (numsLess > k - 1) max = mid - 1;
            else if (numsLess < k - 1) min = mid + 1;
            else break;
        }
//        System.out.println("Nums less than: " + numsLessThan(mid, a));
        System.out.println(findClosest(mid, a));
    }

    private static Map<Long, Integer> lastOccurrence;

    private static long findClosest(long mid, ArrayList<Long> a) {
        long closeness = Long.MAX_VALUE;
        long closest = -1;
        for (int i = 0; i < a.size(); i++) {
            long aa = a.get(i);
            long min = aa == 0 ? 0 : mid / aa;
            int find = Collections.binarySearch(a, min);
            if (aa < 0) {
                if (find < 0) find = -find - 1;
                find = Math.max(find, i + 1);
                find--;
                if (find == i) find--;
            } else if (aa > 0) {
                if (find < 0) find = -find - 2;
                if (find < a.size()) find = lastOccurrence.get(a.get(find));
                find++;
                if (find == i) find++;
            } else find = 0;
            if (find >= 0 && find < a.size()) {
                long candidate = a.get(find);
                if (candidate * aa >= mid && candidate * aa - mid < closeness) {
                    closeness = candidate * aa - mid;
                    closest = candidate * aa;
//                    System.out.println("Closeness: " + closeness + " aa: " + aa + ", Candidate " + candidate);
                }
            }
        }
        return closest;
    }

    private static long numsLessThan(long mid, ArrayList<Long> a) {
        long nums = 0;
        for (int i = 0; i < a.size(); i++) {
            long aa = a.get(i);
            long min = aa == 0 ? 0 : mid / aa;
            int find = Collections.binarySearch(a, min);
            if (aa < 0) {
                if (find < 0) find = -find - 1;
                find = Math.max(find, i + 1);
                nums += a.size() - find;
//                System.out.println("aa: " + aa + "->" + (a.size() - find));
            } else if (aa > 0) {
                if (find < 0) find = -find - 2;
                if (find >= 0 && find < a.size()) find = lastOccurrence.get(a.get(find));
                if (find >= i + 1) nums += find - (i + 1) + 1;
//                System.out.println("aa: " + aa + "->" + (find - (i + 1) + 1) + " find: " + find);
            } else {
                if (mid > 0) nums += a.size() - i - 1;
            }
        }
        return nums;
    }

    //Input Reader
    private static BufferedReader reader;
    private static StringTokenizer tokenizer;

    private static void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    private static String next() throws IOException {
        String read;
        while (!tokenizer.hasMoreTokens()) {
            read = reader.readLine();
            if (read == null || read.equals(""))
                return "-1";
            tokenizer = new StringTokenizer(read);
        }

        return tokenizer.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static long nextLong() throws IOException {
        return Long.parseLong(next());
    }
}