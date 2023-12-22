import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Set<Point> redSet = new HashSet<>();
        for( int i = 0; i < N; i++ ) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point p = new Point(x, y);
            redSet.add( p );
        }
        PriorityQueue<Point> bluePq = new PriorityQueue<>( (a, b) -> a.x - b.x );
        for( int i = 0; i < N; i++ ) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point p = new Point(x, y);   
            bluePq.add( p );
        }
        
        int sum = 0;
        while( !bluePq.isEmpty() ) {
            Point blue = bluePq.poll();
            Point fateRed = null;
            for( Point red : redSet ) {
                if( red.x < blue.x && red.y < blue.y ) {
                    if( Objects.isNull(fateRed) ){
                        fateRed = red;  
                    } else {
                        if( fateRed.y < red.y ) {
                            fateRed = red;
                        }
                    }
                }
            }
            
            if( Objects.nonNull(fateRed) ) {
                redSet.remove( fateRed );
                sum++;
            }
        }
        
        System.out.println( sum );

    }
}

class Point {
    int x;
    int y;
    
    public Point( int x, int y ) {
        this.x = x;
        this.y = y;
    }
}
