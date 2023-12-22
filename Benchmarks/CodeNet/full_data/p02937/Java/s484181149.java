import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<26;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            list.add(add);
        }
        for (int i=0;i<s.length();i++) {
            list.get((int)s.charAt(i)-97).add(i);
        }

        int index = 0;
        int ans = 0;
        for (int i=0;i<t.length();i++) {
            if (list.get((int)t.charAt(i)-97).size()==0) {
                System.out.println(-1);
                return;
            }
            int tmp = ~Collections.binarySearch(list.get((int)t.charAt(i)-97), index, (o1, o2)->o1>=o2?1:-1);
            if (tmp==list.get((int)t.charAt(i)-97).size()) {
                ans++;
                index = list.get((int)t.charAt(i)-97).get(0)+1;
            } else {
                index = list.get((int)t.charAt(i)-97).get(tmp)+1;
            }
        }
        System.out.println(ans*s.length()+index);
        // System.out.println(list);
    }
}