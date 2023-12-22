
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[n-i-1] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int tmp = a[i+1] - a[i];
            if(tmp > 1){
                System.out.println("No");
                return;
            }
            if(tmp > 0){
                a[i+1]--;
            }
        }
        System.out.println("Yes");
    }
}