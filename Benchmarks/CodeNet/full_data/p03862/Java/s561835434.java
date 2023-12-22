import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i=0; i<n-1; i++){
//            while (a[i]+a[i+1] > x){
//                a[i+1]--;
//                count++;
//            }
            if (a[i]+a[i+1] > x){
                count += a[i]+a[i+1] - x;
                a[i+1] -= a[i]+a[i+1] - x;
            }
        }
        System.out.println(count);
    }

}
