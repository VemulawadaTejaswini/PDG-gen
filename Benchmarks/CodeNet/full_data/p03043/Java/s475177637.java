import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        String param = in.nextLine();
        String[] splitParams = param.split(" ");
        int n = Integer.parseInt(splitParams[0]);
        int k = Integer.parseInt(splitParams[1]);

        double ans = 0;

        for( int i = n + 1 ; 1 < i ; i-- ) {
            double coin = 1;
            for (int j = 0; j < i; j++) {
                coin *= 0.5;
            }
            ans += coin/n;
        }

        System.out.println(ans);

    }
}