import java.util.*;
import java.io.*;

/*
 * H - Grid
 */
public class Main
{
private long[][] cache;
private boolean[][] wall;

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

public void run() throws Exception
{
	final BufferedReader reader = new BufferedReader( new InputStreamReader( getInputStream() ) );
	String line = reader.readLine();
	String[] array = line.split( " " );
	final int H = Integer.parseInt( array[ 0 ] );
	final int W = Integer.parseInt( array[ 1 ] );
	wall = new boolean[ H ][];
	cache = new long[ H ][];
	for( int i = 0; i < H; ++i )
	{
		cache[ i ] = new long[ W ];
		Arrays.fill( cache[ i ], -1 );
	}
	int h = 0;
	while( true )
	{
		line = reader.readLine();
		if( line == null )
		{
			break;
		}
		wall[ h ] = new boolean[ W ];
		for( int i = 0; i < W; ++i )
		{
			wall[ h ][ i ] = (line.charAt( i ) == '#');
		}
		++h;
	}

	h = H - 1;
	int w = W - 1;

	long count = getRouteCount( h, w );
	p( count % (1000000000L + 7) );
}

public long getRouteCount( final int h, final int w )
{
	if( h == 0 && w == 0 )
	{
		return 1;
	}
	else
	{
		long cached = cache[ h ][ w ];
		if( cached != -1 )
		{
			return cached;
		}
		if( wall[ h ][ w ] == true )
		{
			cache[ h ][ w ] = 0;
			return 0;
		}
		else
		{
			long count = 0;
			if( h > 0 )
			{
				count += getRouteCount( h - 1, w );
			}
			if( w > 0 )
			{
				count += getRouteCount( h, w - 1 );
			}
			cache[ h ][ w ] = count;
			return count;
		}
	}
}

public static void p( Object o )
{
	System.out.println( o );
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

}
