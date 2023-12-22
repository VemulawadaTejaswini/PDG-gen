import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        
        int count = 0;
        for (int i = 0; i < n -2; i++) {
            if (c[i] == 'A' && c[i+1] == 'B' && c[i+2] == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}
