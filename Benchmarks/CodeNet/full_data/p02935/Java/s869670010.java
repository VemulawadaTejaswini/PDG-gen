import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float[] a = new float[n];
        for(int i =0; i< n; i++){
            a[i] = sc.nextFloat();
        }
        Arrays.sort(a);
        double ans = (a[0]+ a[1])/2;
        if(n>2) {
            for (int j = 2; j < n; j++) {
                ans = (ans + a[j]) / 2;

            }
        }
        System.out.println(ans);
    }
}
