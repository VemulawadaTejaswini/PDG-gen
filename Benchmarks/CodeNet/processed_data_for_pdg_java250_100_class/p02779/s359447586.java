public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();   
        Set<Integer> a = new HashSet<>();
        for( int i = 0; i < n; i++ ) {
            a.add( sc.nextInt() );
        }
        System.out.println( ( n > a.size() ) ? "NO" : "YES" );
        sc.close();
    }
}
