
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Main().solve());
    }
    
    int solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // String[] a = s.split("");
        char[] a = s.toCharArray();
        // あまり
        int count = 0;
        // 現在の比較対象
        char first = a[0];
        for(char c : a) {
            if(c == first) {
                count++;
            } else {
                if(count == 0) {
                    first = c;
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        return a.length - count;
    }
}
