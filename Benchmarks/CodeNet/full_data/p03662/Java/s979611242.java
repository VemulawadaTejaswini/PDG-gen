import java.io.* ;
import java.util.* ;
public class Main
{
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input)
    {
        reader = new BufferedReader(new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException
    {
        while (!tokenizer.hasMoreTokens())
        {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static long nextInt() throws IOException
    {
        return Long.parseLong(next());
    }

    public static int ri() throws IOException
    {
        return (int) nextInt();
    }

    public static long rl() throws IOException
    {
        return nextInt();
    }

    public static double rd() throws NumberFormatException, IOException
    {
        return Double.parseDouble(next());
    }

    static void print_a(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            print(arr[i] + " ");
        }
        println();
    }

    public static int[] ria(int n) throws IOException
    {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = ri();
        }
        return a;
    }

    public static long[] rla(int n) throws IOException
    {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = rl();
        }
        return a;
    }

    public static int p(int i)
    {
        return (int) Math.pow(2, i);
    }

    static PrintWriter writer;

    static void outit(OutputStream outputStream)
    {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    static void print(Object... objects)
    {
        for (int i = 0; i < objects.length; i++)
        {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }

    static void println(Object... objects)
    {
        print(objects);
        writer.println();
//        flush();
    }

    static void close()
    {
        writer.close();
    }

    static void flush()
    {
        writer.flush();
    }

    public static void main(String[] args) throws IOException
    {
        init(System.in);
        outit(System.out);
//        int t = (int) nextInt();
//        for (int i = 0; i < t; i++)
            output() ;
        flush();
        close();
    }
    static long [] a ;
    static long [] b ;
    static int n ;
    static int k ;
    static long p ;
    static List<Integer> [] tree ;
    static int [] par ;
    // 0 - white
    //1 - black
    static int [] color ;
    public static void output() throws IOException
    {
        int n = ri() ;
        tree = new List[n] ;
        for (int i = 0; i <n ; i++)
        {
            tree[i] = new ArrayList<Integer>() ;
        }
        for (int i = 0; i <n-1 ; i++)
        {
            int u = ri()-1 ;
            int v = ri()-1 ;
            tree[u].add(v);
            tree[v].add(u) ;
        }
        par = new int[n] ;
        dfs(0,-1) ;
        int curr = n-1 ;
        ArrayList<Integer> lis = new ArrayList<Integer>() ;
        while(curr!=0)
        {
            lis.add(curr) ;
            curr = par[curr] ;
        }
        lis.add(0) ;
        int white = lis.size()/2 ;
        int black = lis.size()-lis.size()/2 ;
        color = new int[n] ;
        Arrays.fill(color,-1);
        for (int i = 0; i <white ; i++)
        {
            color[lis.get(i)] =  0 ;
        }
        for(int i  = white ; i<lis.size() ; i++)
        {
            color[lis.get(i)] = 1 ;
        }
        for (int i = 0; i <n ; i++)
        {
            if(color[i]!=-1)
            {
                colorise(i,color[i]);
            }
        }
        int wc = 0 ;
        int bc = 0 ;
        for (int i = 0; i <n ; i++)
        {
            if(color[i]==0)
            {
                wc++ ;
            }
            else
            {
                bc++ ;
            }
        }
        if(wc>bc)
        {
            println("Snuke") ;
        }
        else if(wc==bc)
        {
            println("Snuke") ;
        }
        else
        {
            println("Fennec") ;
        }
//        println(Arrays.toString(color)) ;

    }
    static void colorise(int v,int borw)
    {
        color[v] = borw ;
        for(int c : tree[v])
        {
            if(color[c]==-1)
            {
                colorise(c,borw) ;
            }
        }
    }
    static void dfs(int v,int p)
    {
        par[v] = p ;
        for(int c : tree[v])
        {
            if(c!=p)
            {
                dfs(c,v) ;
            }
        }
    }
}