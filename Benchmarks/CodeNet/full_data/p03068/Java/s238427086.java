import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int index = sc.nextInt()-1;
        char ok = c[index];
        
        for (int i = 0; i < n; i++) {
            if (c[i] != ok) {
                c[i] = '*';
            }
            System.out.print(c[i]);
        }
        System.out.println();
    }
}