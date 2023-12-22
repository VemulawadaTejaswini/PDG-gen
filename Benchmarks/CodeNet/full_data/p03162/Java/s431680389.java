import java.util.*;
import java.io.*;

public class Main
{

public static void main( String[] args ) throws Exception
{
	final Scanner sc = new Scanner( new FileInputStream( new File( "1" ) ) );
	final int N = sc.nextInt();//総ステップ数

	//前のステップのA,B,Cそれぞれに到達する際に取り得る最大スコア
	int maxA = 0;
	int maxB = 0;
	int maxC = 0;

	for( int i = 0; i < N; ++i )
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int tmpMaxA = (maxB + a) > (maxC + a) ? (maxB + a) : (maxC + a);
		int tmpMaxB = (maxA + b) > (maxC + b) ? (maxA + b) : (maxC + b);
		int tmpMaxC = (maxA + c) > (maxB + c) ? (maxA + c) : (maxB + c);

		maxA = tmpMaxA;
		maxB = tmpMaxB;
		maxC = tmpMaxC;
	}

	if( maxA > maxB )
	{
		if( maxA > maxC )
		{
			p( maxA );
		}
		else
		{
			p( maxC );
		}
	}
	else
	{
		if( maxB > maxC )
		{
			p( maxB );
		}
		else
		{
			p( maxC );
		}
	}
}

public static void p( Object o )
{
	System.out.println( o );
}

}