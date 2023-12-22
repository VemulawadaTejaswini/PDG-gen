import java.util.*;
import java.io.*;

/*
 * F - LCS
 */
public class Main
{
static char[] s;
static char[] t;
static CharBuf[][] cache2;
static String answer;
private List< Integer >[] indexes = new List[ ( int )'z' + 1 ];

class CharBuf
{
private char c;
private CharBuf next;
private int length = -1;
private String str;

public CharBuf(final CharBuf buf, final char c)
{
	this.c = c;
	next = buf;
}

public CharBuf()
{
	length = 0;
}

public String toString()
{
	if( length == 0 )
	{
		return "";
	}
	else
	{
		if( str == null )
		{
			final StringBuilder buf = new StringBuilder( s.length );
			buf.append( c );
			CharBuf cb = next;
			while( cb.getLength() > 0 )
			{
				buf.append( cb.c );
				cb = cb.next;
			}

			str = buf.toString();
		}
		return str;
	}
}

public int getLength()
{
	if( length == -1 )
	{
		if( next == null )
		{
			length = 1;
		}
		else
		{
			length = next.getLength() + 1;
		}
	}
	return length;
}

}

private void initIndexes()
{
	for( int i = 0; i < t.length; ++i )
	{
		List l = indexes[ ( int )t[ i ] ];
		if( l == null )
		{
			l = new ArrayList<>( t.length / 20 );
			indexes[ ( int )t[ i ] ] = l;
		}
		l.add( i );
	}
}

public void run() throws Exception
{
	long now = System.currentTimeMillis();
	final BufferedReader reader = new BufferedReader( new InputStreamReader( getInputStream() ) );// System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();
	cache2 = new CharBuf[ s.length ][ t.length ];
	initIndexes();

	CharBuf finalResult = search( 0, 0 );
	answer = finalResult.toString();

	p( answer );
	if( System.getProperty( "test" ) != null )
	{
		p( answer.hashCode() );
		p( answer.length() );
		p( System.currentTimeMillis() - now );
	}
}

public static void main( String[] args ) throws Exception
{
	new Main().run();
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

public static int binarySearch( final double[] array, final double d )
{
	int i = Arrays.binarySearch( array, d );
	if( i < 0 )
	{
		return -1 * i - 1;
	}
	return i;
}

private int getNextPos( final char c, int start )
{
	List< Integer > l = indexes[ ( int )c ];
	if( l == null )
	{
		return -1;
	}
	int i = Collections.binarySearch( l, new Integer( start ) );
	if( i < 0 )
	{
		i =  -1 * i - 1;
	}
	
	if( i < l.size() )
	{
		return l.get( i );
	}
	else
	{
		return -1;
	}
}

public CharBuf search( int I, int J )
{
	if( I == s.length || J == t.length )
	{
		//p( "return null" );
		return new CharBuf();
	}

	{
		final CharBuf cached = cache2[ I ][ J ];
		if( cached != null )
		{
			//p( "return cached:" + I + " " + J );//" " + cached );
			return cached;
		}
	}

	CharBuf result = null;

	if( s[ I ] == t[ J ] )
	{
		CharBuf searchResult = search( I + 1, J + 1 );
		CharBuf tmpResult = new CharBuf( searchResult, s[ I ] );
		result = tmpResult;
	}
	else
	{
		//捨てる場合の結果を取得
		final CharBuf resultOnDrop = search( I + 1, J );

		//捨てない場合の結果を取得
		//tの最初のs[ I ]と同じ文字の位置を探す
		int index = getNextPos( s[ I ], J + 1 );

		/*
		int index = -1;
		for( int j = J + 1; j < t.length; ++j )
		{
			if( t[ j ] == s[ I ] )
			{
				index = j;
				break;
			}
		}*/

		if( index != -1 )
		{
			//見つかった
			CharBuf searchResult = search( I + 1, index + 1 );
			int lengthOnUse = searchResult.getLength() + 1;
			if( resultOnDrop.getLength() >= lengthOnUse )
			{
				result = resultOnDrop;
			}
			else
			{
				final CharBuf resultOnUse = new CharBuf( searchResult, s[ I ] );
				result = resultOnUse;

				//キャッシュ
				for( int j = J; j <= index; ++j )
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
