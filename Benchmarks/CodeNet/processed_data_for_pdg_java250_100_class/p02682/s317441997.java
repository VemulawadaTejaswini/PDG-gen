public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        long result = 0;
        if( k <= a ) {
            result = k;
        }
        else if( k <= a + b ) {
            result = a;
        }
        else if( k <= a + b + c ) {
            result = a - ( k - a - b );
        }
        System.out.println( result );
        sc.close();
    }
}
