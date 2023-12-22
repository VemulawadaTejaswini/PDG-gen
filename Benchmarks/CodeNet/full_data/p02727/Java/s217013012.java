import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
* Problem : abc - 160 E
* Acknowledgement : None
* Author : deathnaught_
* GitHub : www.github.com/DeathNaughT-GitHub
* Complexity : O()
*/

public class Main
{

    public static void main(String[] args) 
    {
        FastReader sc = new FastReader();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int p[] = sc.nextArray(A);
        int q[] = sc.nextArray(B);
        int r[] = sc.nextArray(C);
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        long sum = 0;
        int in = A - X, jn = B - Y, cn = C - 1;
        while (cn >= 0) {
            if (in < A && jn < B) {
                //System.out.println(in + ", " + jn +", " + cn);
                if (r[cn] > p[in] && p[in] <= q[jn]) {
                    p[in] = r[cn];
                    in++;
                    cn--;
                }
                else if (r[cn] > q[jn] && q[jn] <= p[in]) {
                    q[jn] = r[cn];
                    jn++;
                    cn--;
                }
                else if (r[cn] <= p[in] && r[cn] <= q[jn]) {
                    break;
                }
            }
            else if (in < A && jn >= B) {
                while (cn >= 0 && in < A && r[cn] > p[in]) {
                    p[in] = r[cn];
                    cn--;
                    in++;
                }
            }
            else if (jn < B && in >= A) {
                while (cn >= 0 && jn < B && r[cn] > q[jn]) {
                    q[jn] = r[cn];
                    cn--;
                    jn++;
                }
            }
            else 
            break;
        }

        for (int i = A - X; i < A; i++) {
            sum += p[i];
        }

        for (int j = B - Y; j < B; j++) {
            sum += q[j];
        }

        System.out.println(sum);
    }

    static class FastReader 
    { 

        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 

		boolean hasNext()
		{
		    return st == null ? false : true;
		}

        char nextChar()
        {
            return next().charAt(0);
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
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 

        int[] nextArray(int rows)
        {
            int arr[] = new int[rows];            
            for (int i = 0; i < rows; i++)
            arr[i] = nextInt();
            return arr;
        }

        long[] nextLongArray(int rows)
        {
            long arr[] = new long[rows];            
            for (int i = 0; i < rows; i++)
            arr[i] = nextLong();
            return arr;
        }

        char[] nextCharArray(int rows)
        {
            char arr[] = new char[rows];
            for (int i = 0; i < rows; i++)
            arr[i] = next().charAt(0);
            return arr;
        }

        int[][] nextMatrix(int rows, int columns)
        {
            int mat[][] = new int[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++)
                {
                    mat[i][j] = nextInt();
                }
            }
            return mat;
        }
    } 

}