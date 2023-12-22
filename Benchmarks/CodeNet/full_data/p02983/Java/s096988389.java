import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Integer.parseInt(sc.next());
        long r = Integer.parseInt(sc.next());
        long ans = Long.MAX_VALUE;
        long diff = r - l;
        for(int i = 0;i<diff;i++){
            for(int j = 0;j<diff - i;j++){
                long tmp = l * (r - j) % 2019;
                ans = Math.min(ans,tmp);
                if(ans == 0){
                    break;
                }
            }
            l += 1;
        }
        System.out.println(ans);
    }
}