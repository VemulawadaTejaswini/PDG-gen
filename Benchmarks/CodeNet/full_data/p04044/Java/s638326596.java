import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        Arrays.sort(array);
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
        
    }
}
