public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int k = sc.nextInt();
        if( k == 10 ) {
            System.out.println( String.valueOf( n ).length() );
        }
        else {
            String baseK = Integer.toString( n, k );
            System.out.println( String.valueOf( baseK ).length() );
        }
        sc.close();
    }
}
