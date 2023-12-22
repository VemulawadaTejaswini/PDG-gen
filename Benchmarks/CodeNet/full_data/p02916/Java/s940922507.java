import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            a = Integer.parseInt(sc.next());
        }
        for(int i = 0;i<n;i++){
            ans += Integer.parseInt(sc.next());
        }
        for(int i = 1;i<n;i++){
            int tmp = Integer.parseInt(sc.next());
            if(i != a){
                ans += tmp;
            }
        }
        System.out.println(ans);
    }
}