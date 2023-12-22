import java.util.*;

class Main{
    public static void main(String[] args) {       
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        double a[] = new double[n];
        Arrays.setAll(a, i -> stdIn.nextInt());

        for(int i = 0; i < m; i++){
            Arrays.sort(a);
            a[n-1] = a[n-1] / 2;
        }
        long ans =0;
        for(int i = 0 ; i < n; i++){
            ans += (int)a[i];
        }
        System.out.println(ans);
   }
}