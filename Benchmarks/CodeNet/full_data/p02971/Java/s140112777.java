
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int [n];
        for(int i = 0; i < n ; i++){
            a[i] = stdIn.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(b);
        
        for(int i = 0; i < n; i++){
            System.out.println(b[n - 1] == a[i] ? b[n - 2] : b[n - 1]);
        }
    }
}