import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] shine = new int[n];
        
        for (int i = 0; i < shine.length; i++) {
            shine[i] = 0;
        }
        
        for (int i = 0; i < shine.length - 1; i++) {
            int j = sc.nextInt() - 1;
            shine[j]++;
        }
        
        for (int i = 0; i < shine.length; i++) {
            System.out.println(shine[i]);
        }
    }
}
