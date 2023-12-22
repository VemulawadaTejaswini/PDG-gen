import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = K * (Math.pow(K-1,N-1));
        System.out.println(cnt);
    }
}