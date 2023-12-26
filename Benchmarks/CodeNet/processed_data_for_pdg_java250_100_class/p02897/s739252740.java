public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int oddCnt = 0;
        if( n % 2 == 0 ) {
            oddCnt = n / 2;
        } else {
            oddCnt = ( n / 2 ) + 1;
        }
        BigDecimal result = new BigDecimal( oddCnt ).divide( new BigDecimal( n ), 10, BigDecimal.ROUND_HALF_UP );
        System.out.println( result );
    }
}
