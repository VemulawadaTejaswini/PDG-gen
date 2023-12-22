import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int day = 0;
        int ans = 0;

        for(int i = 0; i<m; i ++){
            day += sc.nextInt();
        }

        ans = n-day;

        if(n<day){
            ans = -1;
        }

        System.out.println(ans);
    }
}