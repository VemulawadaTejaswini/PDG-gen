import java.util.*;
import java.io.*;

/*
 * F - LCS
 */
public class Main
{
static char[] s;
static char[] t;
static StringBuilder[][] cache2;
static String answer;
static final StringBuilder nullBuilder = new StringBuilder();

public static void main( String[] args ) throws Exception
{
	long now = System.currentTimeMillis();
	final BufferedReader reader = new BufferedReader( new InputStreamReader( getInputStream() ) );// System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();
	cache2 = new StringBuilder[ s.length ][ t.length ];

	answer = search( 0, 0 ).toString();

	p( answer );
	if( System.getProperty( "test" ) != null )
	{
		p( answer.length() );
		p( System.currentTimeMillis() - now );
	}
}

public static InputStream getInputStream() throws IOException
{
	//p( System.getProperties() );
	if( System.getProperty( "test" ) != null )
	{
		return new FileInputStream( "1" );
	}
	else
	{
		return System.in;
	}
}

public static StringBuilder search( int I, int J )
{
	if( I == s.length || J == t.length )
	{
		//p( "return null" );
		return nullBuilder;
	}
	final StringBuilder cached = cache2[ I ][ J ];
	if( cached != null )
	{
		//p( "return cached:" + I + " " + J + " " + cached );
		return cached;
	}

	StringBuilder result = null;

	if( s[ I ] == t[ J ] )
	{
		StringBuilder tmpResult = new StringBuilder();
		tmpResult.append( s[ I ] );
		tmpResult.append( search( I + 1, J + 1 ) );
		result = tmpResult;
	}
	else
	{
		//捨てる場合の結果を取得
		final StringBuilder resultOnDrop = search( I + 1, J );

		//捨てない場合の結果を取得
		//tの最初のs[ I ]と同じ文字の位置を探す
		int index = -1;
		for( int j = J; j < t.length; ++j )
		{
			if( t[ j ] == s[ I ] )
			{
				index = j;
				break;
			}
		}

		if( index != -1 )
		{
			//見つかった
			StringBuilder searchResult = search( I + 1, index + 1 );
			int lengthOnUse = searchResult.length() + 1;

			if( resultOnDrop.length() > lengthOnUse )
			{
				result = resultOnDrop;
			}
			else
			{
				final StringBuilder resultOnUse = new StringBuilder();
				resultOnUse.append( s[ I ] );
				resultOnUse.append( search( I + 1, index + 1 ) );
				result = resultOnUse;

				//キャッシュ
				for( int j = J; j < index + 1; ++j )
				{
					cache2[ I ][ j ] = result;
				}
			}

		}
		else
		{
			result = resultOnDrop;
		}
	}

	//キャッシュ
	cache2[ I ][ J ] = result;

	return result;
}

public static void p( Object o )
{
	System.out.println( o );
}

}
