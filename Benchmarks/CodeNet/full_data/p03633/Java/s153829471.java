import java.util.*;

public class Main {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     long n = sc.nextLong();
     long ans = 1;
     for (int i = 0; i < n; i++) {
        long nextT = sc.nextLong();
        if(nextT % ans == 0) {
            ans = nextT;
        } else {
            int j = 1;
            int k = 1;
            boolean flg = false;
            while(flg == false) {
                j++;
                if(nextT * k < ans * j) {
                    k++;
                }
                if(nextT * k == ans * j) {
                    flg = true;
                }
            }
            ans = nextT * k;
        }
     }
     System.out.println(ans);
  }
}