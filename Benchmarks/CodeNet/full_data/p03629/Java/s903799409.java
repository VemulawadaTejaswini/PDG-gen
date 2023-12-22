import java.util.* ;
import java.io.* ;
public class Main
{
		static BufferedReader reader;
        static StringTokenizer tokenizer;
        static void init(InputStream input)
        {
            reader = new BufferedReader( new InputStreamReader(input) );
            tokenizer = new StringTokenizer("");
        }
        static String next() throws IOException
        {
            while ( ! tokenizer.hasMoreTokens() )
            {
                tokenizer = new StringTokenizer(reader.readLine() );
            }
            return tokenizer.nextToken();
        }
     
        static long nextInt() throws IOException
        {
            return Long.parseLong( next() );
        }
        public static int ri() throws IOException
        {
        	return (int)nextInt() ;
        }
        public static long rl() throws IOException
        {
        	return nextInt() ;
        }
        public static double rd() throws NumberFormatException, IOException
        {
        	return Double.parseDouble(next()) ;
        }
        static void print_a(int [] arr)
        {
        	for(int i = 0 ;i<arr.length ; i++)
        	{
        		print(arr[i]+" ") ;
        	}
        	println() ;
        }
        public static int [] ria() throws IOException
        {
        	int n = ri() ;
        	int [] a = new int[n] ;
        	for(int i = 0 ; i<n ; i++)
        	{
        		a[i] = ri() ;
        	}
        	return a ;
        }
        public static long [] rla() throws IOException
        {
        	int n = ri() ;
        	long [] a = new long[n] ;
        	for(int i =0 ; i<n ; i++)
        	{
        		a[i] = rl() ;
        	}
        	return a ;
        }
        public static int p(int i)
        {
        	return (int)Math.pow(2,i) ;
        }
        static PrintWriter writer;
        static void outit(OutputStream outputStream)
        {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }
        static void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    writer.print(' ');
                writer.print(objects[i]);
            }
        }
     
        static void println(Object...objects) {
            print(objects);
            writer.println();
        }
     
        static void close() {
            writer.close();
        }
     
        static void flush() {
            writer.flush();
        }
        public static void main(String [] args) throws IOException
        {
            init(System.in) ;
            outit(System.out) ;
    //    	int t = (int)nextInt() ;
    //    	for(int i =0 ; i<t ; i++)
            output() ;
            flush();
            close();
        }
        static int n ;
        static String s1 ;
        static String s2 ;
        static long [][] cache ;
        static long mod = 1000000007 ;
        public static void output() throws IOException
        {
        	String s = next() ;
        	int n = s.length() ;
        	char [] c = s.toCharArray() ;
        	int [][] next = new int[n][26] ;
        	for(int i = 0 ; i<26 ; i++)
        	{
        		next[n-1][i] = n ;
        	}
        	next[n-1][c[n-1]-'a'] = n-1 ;
        	for(int i = n-2 ; i>=0 ; i--)
        	{
        		for(int j = 0 ; j<26 ; j++)
        		{
        			next[i][j] =next[i+1][j] ;
        		}
        		next[i][c[i]-'a'] =  i ;
        	}
        	StringBuffer ans = new StringBuffer() ;
        	long [] lengths = new long[n+2] ;
        	Arrays.fill(lengths,Integer.MAX_VALUE) ;
        	char [] min_p = new char[n+2] ;
        	Arrays.fill(min_p,'a') ;
        	lengths[n+1] = 0 ;
        	lengths[n] =  1;
        	lengths[n-1] = 1 ; 
        	for(int i = n-2 ; i>=0 ;i--)
        	{
        		for(int j = 0 ; j<26 ; j++)
        		{
        			if(lengths[i]>1+lengths[next[i][j]+1])
        			{
        				lengths[i] = 1+lengths[next[i][j]+1] ;
        				min_p[i] = (char) ((char)j+'a') ;
        			}
        		}
        	}
        	int curr = 0 ;
        	while(curr!=n&&curr!=n+1)
        	{
//        		println("*"+curr) ;
        		ans.append(min_p[curr]) ;
        		curr = next[curr][min_p[curr]-'a']+1 ;
        	}
//        	println(Arrays.toString(lengths)) ;
//        	println(Arrays.toString(min_p)) ;
        	println(ans) ;
        }
}

