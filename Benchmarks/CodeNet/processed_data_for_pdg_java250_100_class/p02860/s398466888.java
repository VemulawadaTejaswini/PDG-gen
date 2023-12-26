public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        String str = sc.next();
        int strLen = n / 2;
        String string1 = str.substring( 0, strLen );
        String string2 = str.substring( strLen );
        if( string1.equals( string2 ) ) {
            System.out.println( "Yes" );
        }
        else {
            System.out.println( "No" );
        }
        sc.close();
    }
}
