import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        if(n == 2){
            if(a[0] < a[1]){
                System.out.println(a[1]);
            }else{
                System.out.println(a[0]);
            }
        }else{
            Arrays.sort(a);
            int min = gcd(a[0],a[2]);
            int gcd = min;
            int tmp = 0;
            for(int i = 0;i<n-1;i++){
                tmp = gcd(a[i],gcd);
                if(min > tmp){
                    gcd = min;
                    min = tmp;
                }
            }
            System.out.println(gcd);
        }
    }

    public static int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }else{
            return gcd(b,a%b);
        }
    }
}