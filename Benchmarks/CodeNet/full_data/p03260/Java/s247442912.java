import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        if((A*B)%2==1||(A*B*3)%2==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}