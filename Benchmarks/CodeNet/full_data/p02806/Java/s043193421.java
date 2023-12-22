import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S[] = new String[N];
        int T[]=new int[N];
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
            T[i] = sc.nextInt();
        }
        int nanban=0;
        String ans = sc.next();
        for (int i = 0; i < N; i++) {
            if (ans == S[i]) {
                nanban = i;
                break;
            }
        }
        for (int i = (nanban + 1); i < N; i++) {
            total += T[i];
        }
        out.print(total);
    }
}