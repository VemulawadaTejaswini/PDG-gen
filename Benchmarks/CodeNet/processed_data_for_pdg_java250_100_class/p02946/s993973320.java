public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int k = sc.nextInt();   
        int x = sc.nextInt();   
        int before = x - ( k - 1 );
        int after = x + ( k - 1 );
        for( int i = before; i <= after; i++ ) {
            if( i > before ) System.out.print( " " );
            System.out.print( i );
        }
        System.out.println();
        sc.close();
    }
}
