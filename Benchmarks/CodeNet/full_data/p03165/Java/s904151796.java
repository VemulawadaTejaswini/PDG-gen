import java.util.*;
import java.io.*;

/*
 * F - LCS
 */
public class Main
{
static char[] s;
static char[] t;
static String answer;
static int cachePutCount = 0;

private Cache cache1 = new Cache();

class Cache
{
private Map< Integer, Map< Integer, CharBuf >> cache1 = new HashMap<>( 3000 );

public void put( int i, int j, CharBuf cb )
{
	Map< Integer, CharBuf > map = cache1.get( i );
	if( map == null )
	{
		map = new HashMap<>( 1500 );
		cache1.put( i, map );
	}
	map.put( j, cb );
}

public CharBuf get( int i, int j )
{
	Map< Integer, CharBuf > map = cache1.get( i );
	if( map == null )
	{
		return null;
	}
	else
	{
		return map.get( j );
	}
}

public int size()
{
	int size = 0;
	for( Integer key : cache1.keySet() )
	{
		Map<Integer,CharBuf> value = cache1.get( key );
		size += value.size();
	}
	return size;
}

}

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

public void run() throws Exception
{
	long now = System.currentTimeMillis();
	final BufferedReader reader = new BufferedReader( new InputStreamReader( getInputStream() ) );// System.in ) );
	s = reader.readLine().toCharArray();
	t = reader.readLine().toCharArray();

	CharBuf finalResult = search( 0, 0 );

	answer = finalResult.toString();

	p( answer );
	if( System.getProperty( "test" ) != null )
	{
		p( answer.length() );
		p( System.currentTimeMillis() - now );
		p( cachePutCount );
		p( cache1.size() );
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

public CharBuf search( int I, int J )
{
	if( I == s.length || J == t.length )
	{
		//p( "return null" );
		return new CharBuf();
	}

	{
		final CharBuf cached = cache1.get( I, J );
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
		int index = -1;
		for( int j = J + 1; j < t.length; ++j )
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
					cache1.put( I, j, result );
					cachePutCount++;
				}
			}
		}
		else
		{
			result = resultOnDrop;
		}

	}

	//キャッシュ
	cache1.put( I, J, result );
	cachePutCount++;

	return result;
}

public static void p( Object o )
{
	System.out.println( o );
}

}
