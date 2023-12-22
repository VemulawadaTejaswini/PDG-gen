import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner ( System.in );
		String n = sc.next ();
		int k = sc.nextInt ();
		boolean[] d = new boolean[ 10 ];
		Arrays.fill ( d , true );
		for ( int i = 0; i < k; i++ )
		{
			d[ sc.nextInt () ] = false;
		}
		new Main ().run ( n , d );
	}

	public void run ( String n , boolean[] d )
	{
		String result = "";
		int i = -1;
		int c = 0;

		while ( i < d.length && result.length () < n.length () )
		{
			i++;
//			System.out.println ( "i = " + i + "\tresult = " + result );
			if ( d[ i ] )
			{
				if ( i > ( n.charAt ( c ) - '0' ) )
				{
					result = result + Integer.toString ( i );
					int ceil = n.length () - result.length ();
					for ( int j = 0; j < ceil; j++ )
					{
						result = result + "0";
					}
					System.out.println ( result );
					return;
				}
				else if ( i == ( n.charAt ( c ) - '0' ) )
				{
					result = result + Integer.toString ( i );
					i = 0;
					c++;
				}
			}
		}

		System.out.println ( result );
	}

}
