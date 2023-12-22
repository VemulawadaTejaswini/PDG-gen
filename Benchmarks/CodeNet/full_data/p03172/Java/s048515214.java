import java.util.*;
import  java.io.*;
public class Main{

    int ways;
    Main(){
        ways = 0 ;
    }

  public static int soluteTopBottom(int arr[] , int n , int k, int i, int max, int [][]ans){
       if( k <= 0){
           //o.ways = ( o.ways%max + 1 ) %max ;
           return 1;
       }
       
       if(i == n ){
           return 0;
       }

        if(ans[i][k] != 0){
            return ans[i][k];
        }
       for(int j = 1 ; j <= arr[i] ; j++){
           ans[i][k] += soluteTopBottom(arr,n,k-j,i+1,max,ans)%max ; 
       }
       return ans[i][k] ; 
  }

  
  
  public static void main(String []args) throws Exception{
    Reader obj = new Reader();
    int n = obj.nextInt();
    int k = obj.nextInt();
    int max = 1000000007;
    if(k == 0){
        System.out.println(1);
        return ;  
    }
    int []arr=new int[n];
    for(int i = 0 ; i < n ; i++){
        arr[i] = obj.nextInt(); 
    }
    int [][]ans =  new int [n+1][k+1] ; 
    ans[0][0] = 1 ;
    for(int i = 1 ; i <= k ; i++){
        ans[0][i] = 0;
        ans[1][i] = (arr[0] >= i) ? 1 : 0 ;
    }
    for(int i = 1 ; i <= n ; i++){
        ans[i][0] = 1 ;
    }
    int a,b,c;
    for(int i = 2 ; i <= n ; i++){
        for(int j = 1 ; j <= k ; j++){
            a = ans[i][j-1] %max ;
            b = ans[i-1][j]%max ; 
            c = ( j-1-arr[i-1] >= 0 ? ans[i-1][j-1-arr[i-1]] : 0 )%max ;
            b = (a+b)%max;
            c = (b-c)%max;
            ans[i][j] =c; 
        }
    } 
    // for(int i = 0 ; i <= n ; i++){
    //     for(int j = 0 ; j <= k ; j++){
    //         System.out.println(ans[i][j]+" ");
    //     }
    //     System.out.println();
    // }  

    System.out.println(ans[n][k]);
  }


  static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }


}
