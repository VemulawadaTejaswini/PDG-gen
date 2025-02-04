import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");

        long child = 1;
        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            child *= as[i];
        }
        long parent = 0;

        for( int i = 0 ; i < n ; i ++ ){
            parent += child / as[i];
        }

        for( int i = 2 ; i < parent / 2 ; i++ ){
            if( child % 2 == 0 && parent % 2 == 0 ){
                child /= i;
                parent /= i;
                i--;
            }
        }

        System.out.println( (double)child/parent );

    }

}