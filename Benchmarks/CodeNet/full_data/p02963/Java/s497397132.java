import java.util.Scanner;

public class Main {

    public static class Point {
        public int x;
        public int y;
        public Point( int x , int y ){
            this.x = x;
            this.y = y;
        }
        public String toString(){
            return x + " " + y;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt( in.nextLine() );

        // 一か所は0,0
        Point p1 = new Point( 0 , 0 );
        Point p2 = new Point( s , 0 );
        Point p3 = new Point( 0 , 1 );

        System.out.println( p1 + " " + p2 + " " + p3);

    }

}