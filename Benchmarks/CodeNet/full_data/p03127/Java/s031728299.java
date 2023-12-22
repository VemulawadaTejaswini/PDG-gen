import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int gcd = gcd(arr[0],arr[1]);
        if(gcd != 1) {
            for (int i = 2; i < n; i++) {
                gcd = gcd(gcd,arr[i]);
                if(gcd == 1) break;
            }
        }
        System.out.println(gcd);
    }
}