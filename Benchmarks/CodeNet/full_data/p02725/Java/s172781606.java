import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        int out = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        if(a[n - 1] - a[0] < a[n - 2] + Math.abs(k - a[n - 1])){
            out = a[n - 1] - a[0];
        }else{
            out = a[n - 2] + Math.abs(k - a[n - 1]);
        }
        System.out.println(out);
    }
}