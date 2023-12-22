import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            A: for(int j = i + 1; j < s.length(); j++) {
                String sub = s.substring(i, j);
                for(int k = 0; k < sub.length(); k++) {
                    char c = sub.charAt(k);
                    if(c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                        break A;
                    }
                }
                max = Math.max(max, sub.length());
            }
        }
        System.out.println(max);
    }
}