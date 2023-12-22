import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


/*
* Problem : Banned K
* Acknowledgement : None
* Author : deathnaught_
* GitHub : www.github.com/DeathNaughT-GitHub
* Complexity : O(N * maxFreq)
*/

public class Main
{

    public static void main(String[] args) 
    {
        FastReader sc = new FastReader();

        int N = sc.nextInt();
        int arr[] = sc.nextArray(N);
        int freq[] = new int[1_00_000];
        ArrayList<Integer> var = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            freq[arr[i]]++;
            if (!var.contains(arr[i]))
            var.add(arr[i]);
        }

        long comb = 0;
        long calculated1[] = new long[100_000];
        long calculated2[] = new long[100_000];
        long curr[] = new long[100_000];
        long currm[] = new long[100_000];

        //System.out.println(var);

        for (int i = 0; i < var.size(); i++) {
            int element = freq[var.get(i)];
            if (element > 1) {         
                if (calculated1[element] == 0) {     
                    curr[var.get(i)] = nCr(element);
                    currm[var.get(i)] = element == 2 ? 0 : nCr(element - 1);
                    comb = comb + curr[var.get(i)];     
                    calculated1[element] = curr[var.get(i)];
                    calculated2[element] = currm[var.get(i)];
                }
                else {
                    curr[var.get(i)] = calculated1[element];
                    currm[var.get(i)] = calculated2[element];
                    comb = comb + calculated1[element];
                }           
            }
        }

        for (int i = 0; i < N; i++) {
            if (freq[arr[i]] < 2) {
                System.out.println(comb);
            }
            else {
                System.out.println(comb - curr[arr[i]] + currm[arr[i]]);
            }
        }

    }

    static long nCr(int num) {
        long fact1 = 1;
        long fact2 = 1;
        for (int i = 2; i <= num; i++) {
            fact1 *= i;
            if (i <= num - 2)
            fact2 *= i;
        }
        return Math.max(fact1 / fact2 / 2, 1);        
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