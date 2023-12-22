import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }
        if(m < n){
            Arrays.sort(x);
        sum = x[n-1] - x[0];
        int[] dif = new int[n-1];
        for(int i = 0; i < n-1; i++){
            dif[i] = x[i+1] - x[i];
        }
        Arrays.sort(dif);
        int i = 1;
        int j = n-2;
        while(i < m){
            sum -= dif[j];
            i++;
            j--;
        }
        }
        
        System.out.println(sum);
    }
}
