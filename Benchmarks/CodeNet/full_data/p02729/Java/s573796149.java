import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int res = 0;
        if(N > 0) {
            res += N * (N-1) / 2;
        }
        if(M > 0){
            res += M * (M-1) / 2;
        }
        System.out.println(res);
    }
}