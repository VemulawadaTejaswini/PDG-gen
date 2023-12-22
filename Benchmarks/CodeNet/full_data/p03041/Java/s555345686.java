public class Main {

    public static void main( String[] args ){
        int n = Integer.parseInt( args[0] );
        int k = Integer.parseInt( args[1] );
        String s = args[2];
        String[] splited = s.split("");
        String ans = "";
        for( int i = 0 ; i < splited.length ; i++ ){
            if( i == k ){
                ans += splited[i].toLowerCase();
            }
            else {
                ans += splited[i];
            }
        }
        System.out.println(ans);
    }
}