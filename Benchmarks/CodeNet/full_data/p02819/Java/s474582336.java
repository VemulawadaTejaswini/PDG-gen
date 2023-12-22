import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        final int mx = 1100001;
        int hurui[] = new int[mx];

        for (int i = 2;i < Math.sqrt(mx);i++) {
            int ni = i;
            ni += i;
            while(ni < mx) {
                hurui[ni]++;
                ni+=i;
            }
        }

        for(int i=n;i<mx;i++) {
            if(hurui[i] == 0) {
                System.out.print(i);
                break;
            };
        }

    }
}