import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Integer> bounds = generateBoundsIndexList(s);
        System.out.println(bounds);
        int[] childrenCnt = findChildrenCount(s, bounds);
        for(int i = 0, f = s.length(); i < f; ++i) {
            System.out.printf("%d%c", childrenCnt[i], ((i == f - 1) ? '\n' : ' '));
        }
    }
    
    static List<Integer> generateBoundsIndexList(String s) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0, f = s.length() - 1; i < f; ++i) {
            if(s.substring(i, i + 2).equals("RL")) list.add(i);
        }
        return list;
    }
    
    static int[] findChildrenCount(String s, List<Integer> bounds) {
        int[] cnt = new int[s.length()];
        int bi = 0;
        for(int i = 0, f = s.length(); i < f; ++i) {
            int r = bounds.get(bi);
            int l = r + 1;
            int nextBound = (bi < bounds.size() - 1) ? bounds.get(bi + 1) : Integer.MAX_VALUE;
            if(i < r) {
                int tmpi = ((r - i) % 2 == 0) ? r : l;
                ++cnt[tmpi];
            } else if(i <= l) {
                ++cnt[i];
            } else {
                int tmpi = ((i - l) % 2 == 0) ? l : r;
                ++cnt[tmpi];
                bi += (i == nextBound - 1) ? 1 : 0;
            }
        }
        return cnt;
    }
}