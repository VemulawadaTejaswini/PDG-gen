import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==1){
            System.out.println("Hello World");
        }else{
            int A=sc.nextInt();
            int B=sc.nextInt();
            System.out.println(A+B);
        }
    }
}
