import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int k = Integer.parseInt(params[1]);

        params = in.nextLine().split(" ");
        int[] as = new int[n];
        for( int i= 0 ;i< n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
        }

        int count = 0;
        for( int top = 0 ; top< n ; top++ ){
            int max = 0;

            boolean isEnd = false;
            for( int bottom = top; bottom < n && !isEnd; bottom++ ){
                max += as[bottom];

                if( k <= max ){
                    count += n - bottom;

                    int tempMax = max;
                    for( int next = bottom ; next < n && top < n ; next++ ){
                        tempMax -= as[top];
                        if( k <= tempMax ){
                            count += n - bottom;
                            top++;
                        }
                        else {
                            break;
                        }
                    }
                    break;

                }
            }
        }

        System.out.println( count );
        return;

    }
}