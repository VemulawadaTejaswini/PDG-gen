import com.sun.javafx.image.IntPixelGetter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        long k = Long.parseLong(params[1]);
        int q = Integer.parseInt(params[2]);

        int[] scores = new int[n];

        int[] as = new int[q];
        for( int i = 0 ; i < q ; i++ ){
            as[i] = Integer.parseInt( in.nextLine() );
            scores[as[i]-1]++;
        }

        for( int i = 0 ; i < n ; i++ ){
            if( k - q + scores[i] <= 0 ){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }

    }

}
