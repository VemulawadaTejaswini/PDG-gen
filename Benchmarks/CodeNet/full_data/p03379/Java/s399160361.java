import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = x[i];
        }
        Arrays.sort(y);
        int median = y[(n+1)/2-1];
        int median2 = y[(n+1)/2];
        //System.out.println((n+1)/2+" "+median+" "+median2);
        for(int i = 0; i<n; i++) {
            if(x[i]<=median) System.out.println(median2);
            else System.out.println(median);
        }

    }
}