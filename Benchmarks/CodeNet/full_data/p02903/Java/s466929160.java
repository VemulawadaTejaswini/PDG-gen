import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int h = Integer.parseInt(params[0]);
        int w = Integer.parseInt(params[1]);
        int a = Integer.parseInt(params[2]);
        int b = Integer.parseInt(params[3]);

        if( a == 0 ){
            if( b == 0 ){
                for( int i = 0 ; i < h ; i++ ){
                    for( int j = 0 ; j < w ; j++ ){
                        if( j != 0 ){
                            System.out.print(" ");
                        }
                        System.out.print( "0" );
                    }
                    System.out.println();
                }
            }
            else {
                for( int i = 0 ; i < h ; i++ ){
                    for( int j = 0 ; j < w ; j++ ){
                        if( j != 0 ){
                            System.out.print(" ");
                        }
                        System.out.print( i < b ? "0" : "1" );
                    }
                    System.out.println();
                }
            }
            return;
        }
        if( b == 0 ){
            for( int i = 0 ; i < h ; i++ ){
                for( int j = 0 ; j < w ; j++ ){
                    if( j != 0 ){
                        System.out.print(" ");
                    }
                    System.out.print( j < a ? "0" : "1" );
                }
                System.out.println();
            }
            return;
        }

        if( w % a != 0 || h % b != 0 ){
            System.out.println( "No" );
        }

        Queue<Boolean> row = new ArrayDeque<>();
        for( int i = 0 ; i < w ; i++ ){
            row.add(i<a);
        }

        boolean[][] cells = new boolean[h][w];
        for( int i = 0 ; i < h ; i++ ) {
            for (int j = 0; j < w; j++) {
                boolean check = row.poll();
                cells[i][j] = check;
                row.add(check);
            }
            for( int j = 0 ; j < a ; j++ ) {
                row.add( row.poll() );
            }
        }

        for( int i = 0 ; i < h ; i++ ) {
            for( int j = 0 ; j < w ; j++ ) {
                if( j != 0 ){
                    System.out.print(" ");
                }
                System.out.print( cells[i][j] ? "1" : "0" );
            }
            System.out.println();
        }

    }

}

