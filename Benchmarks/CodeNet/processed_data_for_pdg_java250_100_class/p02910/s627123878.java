public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String tapAll  = sc.next();
        String tap;
        String result = "Yes";
        for( int i = 0; i < tapAll.length(); i++ ) {
            tap = String.valueOf( tapAll.charAt( i ) );
            if( ( i + 1 ) % 2 == 0 ) {
                if( !tap.equals( "L" ) && !tap.equals( "U" ) && !tap.equals( "D" ) ) {
                    result = "No";
                }
            }
            else {
                if( !tap.equals( "R" ) && !tap.equals( "U" ) && !tap.equals( "D" ) ) {
                    result = "No";
                }
            }
        }
        System.out.println( result );
    }
}
