import java.util.Scanner;

public class Main {

    public static class Point{
        public long x;
        public long y;
        public String toString(){
            return  x + " " + y;
        }

    }

    public static long square( Point p1 , Point p2 , Point p3 ){
        return ( (p1.x-p3.x)*(p2.y-p3.y) - (p2.x-p3.x)*(p1.y-p3.y) )/2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        if( str.length() == 1 ){
            long s = Long.parseLong( str );
            if( s == 1 ){
                System.out.println( "0 0 0 1 1 1");
                return;
            }
        }
        long longParam = Long.parseLong(str);
        if( longParam < 1000000000 ){
            System.out.println( "0 0 " + longParam + " 0 0 " + 1 );
            return;
        }
        long sqrt = (long)Math.sqrt((double)longParam);
        if( sqrt * sqrt == longParam ){
            System.out.println( "0 0 " + sqrt + " 0 0 " + sqrt );
            return;
        }

        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 1000000000;
        p2.y = 1;

        Point p3 = new Point();
        p3.y = longParam / 1000000000;
        p3.x = p3.y * 1000000000 -longParam;

        System.out.println( p1.toString() + " " + p2.toString() + " " + p3.toString() );

    }

}