import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Main 
{
    public static void main(String[] args) 
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(2, in, out);
        out.close();
    }

    static class TaskC 
    {
        static boolean prime(int n)
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    return false;
                }
            }
            return true;
        }

        static void reverse(long[] a,long start,long end)
        {
            long temp = 0;
            while(start<end)
            {
                temp = a[(int)start];
                a[(int)start] = a[(int)end];
                a[(int)end] = temp;
                start++;
                end--;
            }
        }


   
        
        public void solve(int testNumber, Scanner in, PrintWriter out) 
        {
           long n = in.nextLong();
           long[] a = new long[(int)n];
           int ans=0;
           for(int i=0;i<n;i++)
           {
            a[i] = in.nextLong();
           }

           long point = a[0];
           for(int i=1;i<n;i++)
           {
            if(a[i]>=point)
            {
                point = a[i];
                ans++;
            }
           }

           System.out.println(ans+1);
        }


      
        
        
        static long maxdiff(long[] arr,long size)
        {
            long max = arr[1]-arr[0];
            long min = arr[0];
            for(int i=1;i<(int)size;i++)
            {
                if(arr[i]-min>max)
                {
                    max = arr[i]-min;
                }
                if(arr[i]<min)
                {
                    min = arr[i];
                }

            }
            return max;
        }

                
    }

}