import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long cnt = 0, a, b, c;
        while(((A & 1) == 0) && ((B & 1) == 0) && ((C & 1) == 0)){
            if((A == B) && (B == C)){
                System.out.println(-1);
                return;
            }

            a = A; b = B; c = C;
            A = (b + c) / 2;
            B = (a + c) / 2;
            C = (a + b) / 2;
            cnt++;
        }
        System.out.println(cnt);
        return;
    }
}
