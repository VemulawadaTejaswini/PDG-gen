public class Main{
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if( Character.isUpperCase( str.charAt( 0 ) ) ) {
            System.out.println( "A" );
        }
        else {
            System.out.println( "a" );
        }
    }
}
