import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for(int i = 0 ; i <= n ; i++ ){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++ ){
            b[i] = sc.nextInt();
        }
        sc.close();
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            if(a[i] >= b[i]){
                s += b[i];
            }else if(a[i] + a[i + 1] <= b[i]){
                s += (a[i] + a[i + 1]);
                a[i + 1] = 0;
            }else{
                s += b[i];
                a[i + 1] -= (b[i] - a[i]);
            }
        }
        System.out.println(s);
    }
}