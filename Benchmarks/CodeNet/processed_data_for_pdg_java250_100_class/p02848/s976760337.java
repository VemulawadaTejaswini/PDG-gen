public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        String s = sc.next();
        String result = "";
        List<String> alphabetsList = Arrays.asList( "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" );
        for( int i = 0; i < s.length(); i++ ) {
            int key = alphabetsList.indexOf( String.valueOf( s.charAt( i ) ) );
            if( key + n >= 26 ) {
                key -= 26;
            }
            result += alphabetsList.get( key + n );
        }
        System.out.println( result );
        sc.close();
    }
}
