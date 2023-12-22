import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        char dir = c[0];
        
        int begin = 0;
        int end = n - 1;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (dir != c[i]) {
                if (flag == 0) {
                    if (k == 0) {
                        break;
                    }
                    k--;
                    flag = 1;
                    c[i] = dir;
                } else {
                    c[i] = dir;                   
                }
            } else {
                if (flag == 0) {
                    
                } else {
                    flag = 0;
                }
            }
        }
        
        // for (char a : c) {
        //     System.out.print(a);
        // }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == 'L') {
                if (i == 0) continue;
                if (c[i - 1] == c[i]) {
                    count++;
                }
            } else {
                if (i == n - 1) continue;
                if (c[i + 1] == c[i]) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
