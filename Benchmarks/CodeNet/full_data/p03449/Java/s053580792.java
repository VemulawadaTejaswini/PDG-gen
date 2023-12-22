import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n+1];
        int[] a2 = new int[n+1];
        for(int i = 0; i < n; i++){
            a1[i+1] = a1[i] + sc.nextInt();
            
        }
        for(int i = 0; i < n; i++){
            a2[i+1] = a2[i] + sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            max = Math.max(max, a1[i+1] + a2[n] - a2[i]);
        }
        System.out.println(max);
    }
}
