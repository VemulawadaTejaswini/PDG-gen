import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int h = Integer.parseInt(params[0]);
        int w = Integer.parseInt(params[1]);
        int a = Integer.parseInt(params[2]);
        int b = Integer.parseInt(params[3]);

        if( a == 0 && b != 0 ){
            for( int i = 0 ; i < h ; i++ ){
                for( int j = 0 ; j < w ; j++ ){
                    if( j != 0 ){
                        System.out.print(" ");
                    }
                    System.out.print( i < b ? "0" : "1" );
                }
                System.out.println();
            }
            return;
        }
        if( a != 0 && b == 0 ){
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
        if( a == 0 && b == 0 ){
            for( int i = 0 ; i < h ; i++ ){
                for( int j = 0 ; j < w ; j++ ){
                    if( j != 0 ){
                        System.out.print(" ");
                    }
                    System.out.print( "0" );
                }
                System.out.println();
            }
            return;
        }
    }

}