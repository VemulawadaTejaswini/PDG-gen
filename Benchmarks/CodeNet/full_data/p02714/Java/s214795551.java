import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer>[] chs = new List[128];
        for(int i = 0; i < 128; i++) {
            chs[i] = new ArrayList<>();
        }
        String str = s.next();
        for(int i = 0; i < str.length(); i++) {
            chs[str.charAt(i)].add(i);
        }
        char[] chars= {'R', 'G', 'B'};
        long res = 0;
        for(int i = 0; i < chars.length; i++) {
            res += count(chs[chars[i]], chs[chars[(i+1)%3]], chs[chars[(i+2)%3]]);
            res += count(chs[chars[i]], chs[chars[(i+2)%3]], chs[chars[(i+1)%3]]);
        }
        System.out.println(res);
    }

    private static long count(List<Integer> a, List<Integer> b, List<Integer> c) {
        long res = 0;
        for(int next : a) {
            for(int nextIndex : b) {
                if(nextIndex < next) {
                    continue;
                }
                if(nextIndex > c.get(c.size()-1)) {
                    break;
                }
                int diff = (nextIndex - next);
                int secIndex = Collections.binarySearch(c, nextIndex);
                if(secIndex < 0) {
                    secIndex = -(secIndex + 1);
                }
                int present = Collections.binarySearch(c, nextIndex + diff);
                res += c.size() - secIndex;
                if (present >= 0) {
                    res -= 1;
                }
            }
        }
        return res;
    }
}