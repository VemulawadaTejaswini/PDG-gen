import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int min = (n - 1) * l + r;
        int max = (n - 1) * r + l;
        int ans = max - min + 1;
        if(ans < 0){
            ans = 0;
        }
        System.out.println(ans);
    }
}
