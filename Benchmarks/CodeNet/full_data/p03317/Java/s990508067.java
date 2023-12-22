import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int yono = 0;
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            if(a[i] == 1) yono = i;
        }
        sc.close();
        System.out.println((int) (Math.ceil((yono) * 1.0 / (m - 1)) + Math.ceil((n - yono - 1) * 1.0 / (m - 1))));
    }
}