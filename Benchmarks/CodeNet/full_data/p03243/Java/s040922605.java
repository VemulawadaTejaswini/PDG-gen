import java.util.*;

class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 0;
        while(n>0){
            cur = Math.max(cur,n%10);
            n = n/10;
        }
        int ans = cur*111;

        System.out.println(ans);
    }
}
