import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] a = new char[26];
        for(int i = 0 ; i < 26 ;i++) {
            a[i] = (char)('a'+ i);
        }
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < 26 ;i++) {
            int temp = 0;
            List <Integer> l = new ArrayList<>();
            for(int j = 0 ; j < n ;j++) {
                if(s.charAt(j) == a[i]) {
                    l.add(j - temp);
                    temp = j+1;
                }
            }
            l.add(n - temp);
            Collections.sort(l);
            min = Math.min(min, l.get(l.size()-1));
        }

        System.out.println(min);
    }
}
