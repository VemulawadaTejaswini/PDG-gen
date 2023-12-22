import java.util.*;
import java.io.*;

/*
 * D - Knapsack 1
 */
public class Main
{

public static void main( String[] args ) throws Exception
{
	final Scanner sc = new Scanner( System.in );//new FileInputStream( "7" ) );
	final int N = sc.nextInt();//総アイテム数
	final int W = sc.nextInt();//最大積載量

	final long[] wArray = new long[ N ];
	final long[] vArray = new long[ N ];

	for( int i = 0; i < N; ++i )
	{
		wArray[ i ] = sc.nextLong();
		vArray[ i ] = sc.nextLong();
	}

	Map< Long, Long > weightValueMap = new HashMap<>();
	final Map< Long, List< Integer > > weightItemListMap = new HashMap<>( 1000 );// wをキー,それを構成するアイテムのiのリストを値とする

	for( int i = 0; i < N; ++i )
	{
		final long w = wArray[ i ];
		final long v = vArray[ i ];

		//キャッシュしているすべてのwに対して組み合わせを計算する

		Map< Long, Long > oldMap = new HashMap<>( weightValueMap );
		for( Map.Entry< Long, Long > entry : oldMap.entrySet() )
		{
			final long cachedWeight = entry.getKey();
			final long cachedValue = entry.getValue();
			final long newWeight = cachedWeight + w;
			final long newValue = cachedValue + v;
			if( newWeight <= W )
			{
				final boolean isBetter = setIfBetter( weightValueMap, newWeight, newValue );
				if( isBetter )
				{
					List< Integer > itemList = weightItemListMap.get( newWeight );
					if( itemList == null )
					{
						itemList = new ArrayList<>();
						weightItemListMap.put( newWeight, itemList );
					}
					itemList.addAll( weightItemListMap.get( cachedWeight ) );
					itemList.add( i );
				}
			}
		}

		//このアイテム単体について処理
		if( w <= W )
		{
			final boolean isBetter = setIfBetter( weightValueMap, w, v );
			if( isBetter )
			{
				List< Integer > itemList = weightItemListMap.get( w );
				if( itemList == null )
				{
					itemList = new ArrayList<>();
					weightItemListMap.put( w, itemList );
				}
				itemList.add( i );
			}
		}
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

public static boolean setIfBetter( final Map< Long, Long > weightValueMap, final long w, final long v )
{
	final Long cachedValue = weightValueMap.get( w );
	if( cachedValue == null || cachedValue < v )
	{
		weightValueMap.put( w, v );
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