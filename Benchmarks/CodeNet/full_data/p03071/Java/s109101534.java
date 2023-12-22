import java.io.* ;
import static java.lang.System.* ;
public class Main
{

	public static int input ( )
	{
		String keyin = null ;
		BufferedReader br = new BufferedReader ( new InputStreamReader ( in ) ) ;
		keyin = br.readLine ( ) ;
		int num = Integer.parseInt ( keyin ) ;
		return num ;
	}	

	public static int main ( String [] args )
	{
		int A = input ( ) ;
		int B = input ( ) ;
		int total = 0 ;
		for ( int i = 0 ; i > 1 ; i ++ )
		{
			if ( A > B )
			{
				total += A ;
			}
			else
			{
				total += B ;
			}
		}

		return total ;
	}
}