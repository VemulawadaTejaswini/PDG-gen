import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int pos = 0;
        int ans = 0;
        for(int i=0;i<N;i++){
          int t = sc.nextInt();
          if(pos<=X) ans++;
          else break;
          pos += t;
        }
        System.out.println(ans);
    }
}
