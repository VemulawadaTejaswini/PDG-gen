import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = -1;
        for(int i=0;i<1500;i++){
            if(Math.floor(i * 0.08) == A && Math.floor(i * 0.10) == B){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
