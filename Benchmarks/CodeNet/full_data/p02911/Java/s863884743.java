import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[q];
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = k - q;
        }
        for(int i = 0; i < q; i++){
            a[i] = scan.nextInt() - 1;
            p[a[i]]++;
        }
        for(int i = 0; i < n ; i++){
            if(p[i] <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}