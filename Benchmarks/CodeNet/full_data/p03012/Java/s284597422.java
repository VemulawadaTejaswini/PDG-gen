    import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum1 = 0;
            int sum2 = 0;
            for(int i=0;i<n;i++) { a[i] = sc.nextInt(); sum2+=a[i]; }
            int min = Math.abs(sum2-sum1);
            for(int i=0;i<n;i++){
                sum1 += a[i];
                sum2 -= a[i];
                int x = Math.abs(sum2-sum1);
                if(x<min) min = x;
            }
            System.out.println(min);
        }
    }							