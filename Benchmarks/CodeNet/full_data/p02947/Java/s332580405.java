import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char[] c = str.toCharArray();
            Arrays.sort(c);
            
            String str2 = "";
            for (int j = 0; j < 10; j++) {
                str2 += c[j];
            }
            array[i] = str2;
        }
        Arrays.sort(array);
        String now = array[0];
        long ans = 0;
        long count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i].equals(now)) {
                count++;
                ans += count;
            } else {
                now = array[i];
                count = 0;
            }
        }
        
        System.out.println(ans);
    }
}
