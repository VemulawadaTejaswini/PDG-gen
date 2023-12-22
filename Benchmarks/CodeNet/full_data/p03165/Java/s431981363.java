import java.io.*;
import java.math.BigInteger;
import java.util.*;
import static java.lang.Math.PI;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main
{
    static char a[];
    static char b[];
    static int dp[][];

    static int give_me_LCS_from_this_position(int i, int j)
    {
        if(i == a.length || j == b.length) 
            return 0;

        if(dp[i][j] != -1)
            return dp[i][j];

        int LCS = 0;
        if(a[i] == b[j])
        {
            LCS = 1 + give_me_LCS_from_this_position(i+1, j+1);
        }
        else
        {
            int ans1 = give_me_LCS_from_this_position(i+1, j);
            int ans2 = give_me_LCS_from_this_position(i, j+1);
            LCS = Math.max(LCS, Math.max(ans1, ans2));
        }
        dp[i][j] = LCS;
        return LCS;
    }

    static void display(int i, int j, int l, PrintWriter p)
    {
        if(i == a.length || j == b.length)  return;

        if(dp[i][j] == l && a[i] == b[j])
        {
            p.print(a[i]);
            display(i+1, j+1, l-1, p);
        }
        else
        {
            if(dp[i][j+1] == l)
            {
                display(i, j+1, l, p);
            }
            else if(dp[i+1][j] == l)
            {
                display(i+1, j, l, p);
            }
        }
    }

    public static void main(String[] args) throws Exception 
    {
        Foster sc = new Foster();
        PrintWriter p = new PrintWriter(out);
        a = sc.next().toCharArray();
        b = sc.next().toCharArray();
        dp = new int[a.length+1][b.length+1];
        for(int i = 0; i <= a.length; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        int length_of_LCS = give_me_LCS_from_this_position(0, 0);
        sc.watch(length_of_LCS);
        display(0 ,0, length_of_LCS, p);
        p.println();
        p.close();
    }
/* 
*/    
/*
1. Check overflow in pow function or in general
2. Check indices of read array function
3. Think of an easier solution because the problems you solve are always easy
4. Check iterator of loop
5. If still doesn't work, then jump from the 729th floor 'coz "beta tumse na ho paayega"

    Move to top!!
*/
    static class Foster 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer("");
        String next() 
        {
            while (!st.hasMoreTokens())
                try 
                {
                    st = new StringTokenizer(br.readLine());
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            return st.nextToken();
        }
        int nextInt() 
        {
            return Integer.parseInt(next());
        }
        long nextLong() 
        {
            return Long.parseLong(next());
        }
        double nextDouble() 
        {
            return Double.parseDouble(next());
        }
        int[] intArray(int n)                   // Check indices
        {
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextInt();
            }
            return arr;
        }
        long[] longArray(int n)                 // Check indices
        {
            long arr[] = new long[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = nextLong();
            }
            return arr;
        }
        int[] getBits(int n)                    //in Reverse Order
        {
            int a[] = new int[31];
            for(int i = 0; i < 31; i++)
            {
                if(((1<<i) & n) != 0)
                    a[i] = 1;
            }
            return a;
        }
        static long pow(long... a)
        {
            long mod = Long.MAX_VALUE;
            if(a.length == 3)   mod = a[2];
            long res = 1;
            while(a[1] > 0)
            {
                if((a[1] & 1) == 1)
                    res = (res * a[0]) % mod;
                a[1] /= 2;
                a[0] = (a[0] * a[0]) % mod;
            }
            return res;
        }
        void print(Object... o) 
        {
            for(Object next : o)
            {
                System.err.print(next + " ");
            }
        }
        void println(Object... o) 
        {
            for(Object next : o)
            {
                System.err.print(next + " ");
            }
            System.err.println();
        }
        void watch(Object...a) throws Exception 
        {
            int i = 1;
            for (Object o: a) 
            {
                boolean found = false;
                if (o.getClass().isArray()) 
                {
                    String type = o.getClass().getName().toString();
                    switch (type) 
                    {
                        case "[I":
                        {
                            int[] test = (int[]) o;
                            println(i + " : " + Arrays.toString(test));
                            break;
                        }
                        case "[[I":
                        {
                            int[][] obj = (int[][]) o;

                            println(i + " : " + Arrays.deepToString(obj));
                            break;
                        }
                        case "[J":
                        {

                            long[] obj = (long[]) o;
                            println(i + " : " + Arrays.toString(obj));
                            break;
                        }
                        case "[[J":
                        {

                            long[][] obj = (long[][]) o;
                            println(i + " : " + Arrays.deepToString(obj));
                            break;
                        }
                        case "[D":
                        {

                            double[] obj = (double[]) o;
                            println(i + " : " + Arrays.toString(obj));
                            break;
                        }
                        case "[[D":
                        {

                            double[][] obj = (double[][]) o;
                            println(i + " : " + Arrays.deepToString(obj));
                            break;
                        }
                        case "[Ljava.lang.String":
                        {

                            String[] obj = (String[]) o;
                            println(i + " : " + Arrays.toString(obj));
                            break;
                        }
                        case "[[Ljava.lang.String":
                        {

                            String[][] obj = (String[][]) o;
                            println(i + " : " + Arrays.deepToString(obj));
                            break;
                        }
                        case "[C":
                        {
                            char[] obj = (char[]) o;
                            println(i + " : " + Arrays.toString(obj));
                            break;
                        }
                        case "[[C":
                        {

                            char[][] obj = (char[][]) o;
                            println(i + " : " + Arrays.deepToString(obj));
                            break;
                        }
                        default:
                        {
                            println(i + " : type not identified");
                            break;
                        }
                    }
                    found = true;
                }
                if (o.getClass() == ArrayList.class) 
                {
                    println(i + " : LIST = " + o);
                    found = true;
                }
                if (o.getClass() == TreeSet.class) 
                {
                    println(i + " : SET = " + o);
                    found = true;
                }
                if (o.getClass() == TreeMap.class) 
                {
                    println(i + " : MAP = " + o);
                    found = true;
                }
                if (o.getClass() == HashMap.class) 
                {
                    println(i + " : MAP = " + o);
                    found = true;
                }
                if (o.getClass() == LinkedList.class) 
                {
                    println(i + " : LIST = " + o);
                    found = true;
                }
                if (o.getClass() == PriorityQueue.class) 
                {
                    println(i + " : PQ = " + o);
                    found = true;
                }
                if (!found) 
                {
                    println(i + " = " + o);
                }
                i++;
            }
        }
    }
}