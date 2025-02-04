import java.io.*; 
import java.util.*;

class Compare implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        return a.y - b.y;
    }
}

class Pair{
    String x;
    int y;

    Pair(String a, int b){
        x = a;
        y = b;
    }
}

public class Main {

    public static int solute(int []arr, int i){
        if(i==0){
            return 0;
        }
        int a = 0 , b = 0;
        if(i >= 2){
            a = Math.abs(arr[i]-arr[i-1]) + solute(arr,i-1);
            b = Math.abs(arr[i]-arr[i-2]) + solute(arr,i-2);
            return Math.min(a,b);
        }else if(i==1){
            return Math.abs(arr[i] - arr[i-1]);
        }
        return -1 ;
    }

    public static int soluteTopBottom(int []arr, int i, int []ans){
        if(i == 0 ){
            ans[0] = 0 ;
            return 0;
        }
        int a = 0 , b = 0;
        if(i >= 2){
            if(ans[i-1]!=-1){
                a = Math.abs(arr[i]-arr[i-1]) + ans[i-1];
            }else{
                a = Math.abs(arr[i]-arr[i-1]) + soluteTopBottom(arr,i-1,ans);
            }

            if(ans[i-2]!=-1){
                b = Math.abs(arr[i]-arr[i-2]) + ans[i-2];
            }else{
                b = Math.abs(arr[i]-arr[i-2]) + soluteTopBottom(arr,i-2,ans);
            }

            return Math.min(a,b);
        }else if(i==1){
            ans[i] = Math.abs(arr[i] - arr[i-1]);
            return ans[i];
        }
        return -1;
    }
    public static int soluteBottomUp(int [][]arr, int n, int c){
        int [][]ans = new int [n+1][c+1];
        for(int i = 0 ; i <= n ; i++){
            ans[i][0] = 0;
        }
        for(int i = 0 ; i <= c ; i++){
            ans[0][i] = 0;
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= c ; j++){
                if(arr[i-1][0] <= j){
                    ans[i][j] = arr[i-1][1] + ans[i-1][j-arr[i-1][0]];
                }else{
                    ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
                }
            }
        }
        return ans[n][c];
    }

    public static void main(String []args) throws Exception{
        Reader obj = new Reader();
        int n = obj.nextInt();
        int w = obj.nextInt();
        int [][]arr = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            arr[i][0] = obj.nextInt();
            arr[i][1] = obj.nextInt();
        }

        //System.out.println(solute(arr,n-1));
        //System.out.println(soluteTopBottom(arr,n-1,ans));
        System.out.println(soluteBottomUp(arr, n, w));
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
