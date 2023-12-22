import java.util.*;

public class Main {

    public static class Arm {
        long x;
        long l;
        long min;
        long max;
        long distance;
        public Arm( long x , long l ){
            this.x = x;
            this.l = l;
            this.min = x - l;
            this.max = x + l;
            this.distance = this.max - this.min;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        List<Arm> arms = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            String[] params = in.nextLine().split(" ");
            arms.add( new Arm( Long.parseLong( params[0] ) , Long.parseLong( params[1] ) ) );
        }

        arms.sort( (o1, o2) -> {
            if( o1.min < o2.min ){
                return -1;
            }
            if( o1.min == o2.min ){
                return 0;
            }
            return 1;
        } );

        for( int i = 0 ; i < arms.size() ; i++ ){
            Arm iArm = arms.get(i);
            for( int j = i + 1 ; j < arms.size() ; j++ ){
                Arm jArm = arms.get(j);
                if( jArm.min < iArm.max ){
                    arms.remove(j);
                    n--;
                    j--;
                    continue;
                }
                break;
            }
        }

        System.out.println( n );

    }

}
