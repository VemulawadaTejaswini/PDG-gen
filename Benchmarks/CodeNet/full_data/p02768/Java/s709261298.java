import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 1;
        int ans = 0;

        for(int i=1; i<=n; i++){
            if(i!=a && i!=b){
                for(int j=1; j<i; j++){
                    x *= j;
                }
                ans += x;
            }
        }
        System.out.println((int)ans%(Math.pow(10, 9)+7));
    }
}