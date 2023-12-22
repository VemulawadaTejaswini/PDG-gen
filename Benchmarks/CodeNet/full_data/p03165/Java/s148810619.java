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

    public static int soluteBottomUp(String str1, String str2, int a, int b, int m, int n, int [][]arr){
        for(int i = 0 ; i < b ; i++){
            arr[0][i] = 0;
        }
        for(int i = 0 ; i < a ; i++){
            arr[a][0] = 0;
        }
        
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ; j <= b ; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }else{
                    arr[i][j] = Math.max(arr[i-1][j] , arr[i][j-1]);
                }
            }
        }
        return arr[a][b];
    }

    
    public static void main(String []args) throws Exception{
        Reader obj = new Reader();
        String a = obj.readLine();
        String b = obj.readLine();
        int m = a.length();
        int n = b.length();
        int [][]arr = new int[m+1][n+1];
        soluteBottomUp(a,b,m,n,0,0,arr);
        String ans = "";

        int i = m ; 
        int j = n;
        while(i>0&&j>0){
            if(arr[i][j] == arr[i-1][j-1]+1){
                ans = a.charAt(i-1) + ans ;
                i--;
                j--;
            }else{
                if(arr[i][j] == arr[i-1][j]){
                    i--;
                }else{
                    j--;
                }
            }
        }
        System.out.println(ans);
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

