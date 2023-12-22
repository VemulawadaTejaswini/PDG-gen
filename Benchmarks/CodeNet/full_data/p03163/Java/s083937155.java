import java.util.*;
import java.io.*;

/*
 * E - Knapsack 1
 */
public class Main
{

public static void main( String[] args ) throws Exception
{
	final Scanner sc = new Scanner( System.in );// new FileInputStream( "1" ) );
	final int N = sc.nextInt();//総アイテム数
	final int W = sc.nextInt();//最大積載量

	final long[] wArray = new long[ N ];
	final long[] vArray = new long[ N ];

	for( int i = 0; i < N; ++i )
	{
		wArray[ i ] = sc.nextLong();
		vArray[ i ] = sc.nextLong();
	}

	final Map< Long, Long > weightValueMap = new HashMap<>( 1000 );
	//final Map< Long, List< Integer > > weightItemListMap = new HashMap<>( 1000 );// wをキー,それを構成するアイテムのiのリストを値とする

	for( int i = 0; i < N; ++i )
	{
		final long w = wArray[ i ];
		final long v = vArray[ i ];

		//キャッシュしているすべてのwに対して組み合わせを計算する

		Map< Long, Long > update = new HashMap<>();
		final Map< Long, List< Integer > > update2 = new HashMap<>();
		for( Map.Entry< Long, Long > entry : weightValueMap.entrySet() )
		{
			final long cachedWeight = entry.getKey();
			final long cachedValue = entry.getValue();
			final long newWeight = cachedWeight + w;
			final long newValue = cachedValue + v;
			if( newWeight <= W )
			{
				final boolean isBetter = isBetter( weightValueMap, newWeight, newValue );
				if( isBetter )
				{
					update.put( newWeight, newValue );
					/*
					List< Integer > itemList = weightItemListMap.get( newWeight );
					if( itemList == null )
					{
						itemList = new ArrayList<>();
						update2.put( newWeight, itemList );
					}
					itemList.addAll( weightItemListMap.get( cachedWeight ) );
					itemList.add( i );
					*/
				}
			}
		}

		weightValueMap.putAll( update );

		clean( weightValueMap );
		//weightItemListMap.putAll( update2 );

		//このアイテム単体について処理
		if( w <= W )
		{
			final boolean isBetter = isBetter( weightValueMap, w, v );
			if( isBetter )
			{
				weightValueMap.put( w, v );
				/*
				List< Integer > itemList = weightItemListMap.get( w );
				if( itemList == null )
				{
					itemList = new ArrayList<>();
					weightItemListMap.put( w, itemList );
				}
				itemList.add( i );
				*/
			}
		}

		weightValueMap.putAll( update );
	}

	//答えを求める
	long max = 0;
	for( Map.Entry< Long, Long > entry : weightValueMap.entrySet() )
	{
		final long v = entry.getValue();
		if( v > max )
		{
			max = v;
		}
	}
	p( max );
}

public static void clean( final Map< Long, Long > weightValueMap )
{
	//重さが高く、価値が低い情報を削除する
	final TreeSet< Long > weightSet = new TreeSet< Long >();
	weightSet.addAll( weightValueMap.keySet() );
	long maxValue = 0;
	for( Long weight : weightSet )
	{
		long value = weightValueMap.get( weight );
		if( value < maxValue )
		{
			weightValueMap.remove( weight );
		}
		else
		{
			maxValue = value;
		}
	}
}

public static boolean isBetter( final Map< Long, Long > weightValueMap, final long w, final long v )
{
	final Long cachedValue = weightValueMap.get( w );
	if( cachedValue == null || cachedValue < v )
	{
		return true;
	}
	else
	{
		return false;
	}
}

public static void p( Object o )
{
	System.out.println( o );
}

}