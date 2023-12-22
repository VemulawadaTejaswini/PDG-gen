public class Main
{

	public static int input ( )
	{
		String keyin = null ;
		BufferdReader br = null ;
		BufferdReader br = new BufferdReader ( new InputStreamReader ( in ) ) ;
		keyin = br.readLine ( ) ;
		int num = Integer.parseInt ( keyin ) ;
		return num ;
	}	

	public static void main ( String [] args )
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