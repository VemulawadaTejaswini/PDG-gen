import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;


public class Main
{
	public static void main( String[] args ) throws IOException
	{
		Reader.init(System.in);
		int n = Reader.nextInt();
		int k = Reader.nextInt();
		int[] arey = new int[n];
		for ( int i2 = 0 ; i2 < n ; i2++ )
		{
			arey[i2] = Reader.nextInt();
		}
		Arrays.sort(arey);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for ( int i = 0 ; i < n ; i++ )
		{
			if ( map.containsKey(arey[i]) )
			{
				map.put(arey[i], map.get(arey[i])+1);
			}
			else
			{
				map.put(arey[i],1);
			}
		}

        Map<Integer, Integer> result2 = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

/*        for ( Entry<Integer, Integer> entry : result2.entrySet())
        {
        	Integer key = entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println(key+"  "+value);
        }*/

        int size = result2.size();
        if ( size <= k )
        {
        	System.out.println("0");
        }
        else
        {
        	int actual = size - k;
	        int count = 0;
	        int k2 = 0;
	        for ( Entry<Integer, Integer> entry : result2.entrySet())
	        {
	            Integer value = (Integer) entry.getValue();
	            count = count + value;
	            k2++;
	            if ( k2 == actual )
	            {
	            	break;
	            }
	        }
	        System.out.println(count);
        }
	}
}

/** Class for buffered reading int and double values */
class Reader
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input)
    {
        reader = new BufferedReader(new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() )
        {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }

    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
}