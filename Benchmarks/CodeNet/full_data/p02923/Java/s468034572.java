import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        int tmp = 0;
        int h1 = Integer.parseInt(sc.next());
        int h2 = 0;
        for(int i = 1;i<n;i++){
            h2 = Integer.parseInt(sc.next());
            if(h1 >= h2){
                tmp += 1;
                if(i == n -1){
                    ans = Math.max(tmp,ans);
                }
            }else{
                ans = Math.max(tmp,ans);
                tmp = 0;
            }
            h1 = h2;
        }
        System.out.println(ans);
    }
}