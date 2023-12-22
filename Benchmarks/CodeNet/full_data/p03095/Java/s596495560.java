import java.util.Scanner;

public class Main {
    static int count = 0;
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public Main( final String str ){
        inputstring = str;
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S = scan.next();
        Main combobj= new Main(S);
        combobj.combine();
        System.out.println(count-1);
        scan.close();
    }
    
    public void combine() { combine( 0 ); }
    private void combine(int start ){
        count++;
        for( int i = start; i < inputstring.length(); ++i ){
            output.append( inputstring.charAt(i) );
            // System.out.println( output );
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }
} 