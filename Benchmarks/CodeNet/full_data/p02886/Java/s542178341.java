// Why do we fall ? So we can learn to pick ourselves up.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dd = new int[n];
        for(int i=0; i<n; i++){
            dd[i] = sc.nextInt();
        }
        int ss = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n ;j++){
                ss += dd[i]*dd[j];
            }
        }
        System.out.println(ss);
    }
}