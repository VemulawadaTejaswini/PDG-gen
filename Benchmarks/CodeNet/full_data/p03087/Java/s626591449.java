import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        String S = sc.next();
        String[] sp = S.split("");
        int[] l = new int[Q];
        int[] r = new int[Q];
        
        int[] sum = new int[sp.length];
        sum[0] = 0;
        int count = 0;
        for(int i = 1; i < N; i++) {
            if(sp[i-1].equals("A") && sp[i].equals("C")) {
                count++;
                sum[i-1] = count;
            }
            sum[i] = count;
        }
        
        int last = 0;
        int first = 0;
        int ans = 0;
        for(int i = 0; i < Q; i++) {
            first = Integer.parseInt(sc.next());
            last = Integer.parseInt(sc.next());

            first--;
            last--;
            
            
            if(sum[last] == 0) {
                System.out.println(0);
            }else if(first == 0) { //パターン1, 2
                if(sum[last] == sum[last-1]) {
                    if(sum[first] == 0) {
                        System.out.println(sum[last]);
                    }else {
                        System.out.println(sum[last] - sum[first] + 1);
                    }
                    
                }else {
                    if(sum[first] == 0) {
                        System.out.println(sum[last] - 1);
                    }else {
                        System.out.println(sum[last] - sum[first]);
                    }
                }
            }else if(last - first == 1) {
                if(sum[first] == sum[first-1]) {
                    System.out.println(0);
                }else {
                    System.out.println(1);
                }
            }else {
                //➀
                if(sum[first] != sum[first-1] && sum[last] == sum[last-1]) {
                    System.out.println(sum[last] - sum[first] + 1);
                //➁
                }else if (sum[first] != sum[first-1] && sum[last] != sum[last-1]) {
                    System.out.println(sum[last] - sum[first]);
                //➂
                }else if (sum[first] == sum[first-1] && sum[last] == sum[last-1]) {
                    System.out.println(sum[last] - sum[first]);
                //④
                }else {
                    System.out.println(sum[last] - sum[first] - 1);
                }
            }
            
        }
        
    }
}