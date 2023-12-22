import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/*
 * J - Sushi
 */
public class Main
{
double[][][] cache = new double[ 301 ][ 301 ][ 301 ];

public static void main( String[] args ) throws Exception
{
	new Main().run();
}

private void initCache()
{
	for( int i = 0; i < 301; ++i )
	{
		for( int j = 0; j < 301; ++j )
		{
			for( int k = 0; k < 301; ++k )
			{
				cache[ i ][ j ][ k ] = -1;
			}
		}
	}
}

public void run() throws Exception
{
	initCache();
	final Scanner sc = new Scanner( getInputStream() );
	final int N = sc.nextInt();
	int[] data = new int[] { 0, 0, 0, 0 };
	for( int i = 0; i < N; ++i )
	{
		data[ sc.nextInt() ]++;
	}
	p( getE2( N, data ) );
}

/*
 * すばり回数の期待値を返す
 */
public double getE2( double dish_size, int[] data )
{
	double cached = cache[ data[ 0 ] ][ data[ 1 ] ][ data[ 2 ] ];
	if( cached != -1 )
	{
		return cached;
	}

	//0とそれ以外の比率を求める
	double count = 0;
	for( int i = 1; i <= 3; ++i )
	{
		count += data[ i ];
	}
	double p = count / (count + data[ 0 ]);
	if( p == 0 )
	{
		return 0;
	}

	double ex = 1 / p;//この状態で次の1つを消費するまでの回数の期待値

	//消費するそれぞれのパターンについて確率を求める
	for( int i = 3; i > 0; --i )
	{
		if( data[ i ] > 0 )
		{
			double patternRatio = data[ i ] / count;
			int[] data2 = Arrays.copyOf( data, data.length );
			data2[ i ]--;//今回選択されたものが減る
			data2[ i - 1 ]++;//1つ少ない数が増える
			ex += patternRatio * getE2( dish_size, data2 );
		}
	}

	//p( ex );

	cache[ data[ 0 ] ][ data[ 1 ] ][ data[ 2 ] ] = ex;
	return ex;
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
