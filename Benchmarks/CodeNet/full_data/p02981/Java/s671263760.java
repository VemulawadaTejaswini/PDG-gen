
import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int train = n * a;

        int result = 0;

        if(train <= b){
            result = train;
        }else{
            result = b;
        }

        System.out.println(result);


    }
}
