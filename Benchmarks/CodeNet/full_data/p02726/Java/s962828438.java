
import java.io.*;
import java.util.*;
import java.math.*;

public class Main { 
    
    public static void main(String[] args) throws java.lang.Exception { 
        Reader pm =new Reader(); 
        //Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        while(t-- > 0){
            int n = pm.nextInt();
            int x = pm.nextInt();
            int y = pm.nextInt();
            HashMap<Integer, Integer> hm = new HashMap<>();
            HashMap<String, Integer> hm2 = new HashMap<>();

            for(int i=1;i<=n;i++) {
                for(int j=i+1;j<=n;j++) {
                    int d = j-i;
                    hm2.put(i+"->"+j, d);
                    hm.merge(d, 1, Integer::sum);
                }
            }
            for(int i=1;i<=n;i++) {
                for(int j=i+1;j<=n;j++) {
                    int d1 = Math.abs(x-i);
                    int d2 = Math.abs(y-j);
                    int pd = hm2.get(i+"->"+j);
                    int d = Math.min(pd, d1+d2+1);
                    hm2.put(i+"->"+j, d);

                    int pre = hm.get(pd);
                    hm.put(pd, pre-1);
                    hm.merge(d,1,Integer::sum);
                }
            }
            Set<Integer> st = hm.keySet();
            StringBuffer sb = new StringBuffer();
            
            for(int i:st){
                sb.append(hm.get(i)+"\n");
            }
            System.out.println(sb);
        }
        //end of tests
        
    }
    //end of main class

    static int countInRange(int arr[], int n, int x, int y) { 
        // initialize result 
        int count = 0; 
        count = upperIndex(arr, n, y) -  
                lowerIndex(arr, n, x) + 1; 
        return count; 
    } 
    
    
    static int lowerIndex(int arr[], int n, int x) { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] >= x) 
                h = mid - 1; 
            else
                l = mid + 1; 
        } 
        return l; 
    } 
      
    // function to find last index <= y 
    static int upperIndex(int arr[], int n, int y) { 
        int l = 0, h = n - 1; 
        while (l <= h)  
        { 
            int mid = (l + h) / 2; 
            if (arr[mid] <= y) 
                l = mid + 1; 
            else
                h = mid - 1; 
        } 
        return h; 
    }
    
    public static StringBuilder dec_to_bin(long n) {
        // decimal to binary upto 30 binaries
        if(n==0) {
            StringBuilder str=new StringBuilder("");
            for(int i=0;i<30;i++) {
                str.append("0");
            }
            return str;
        }
        StringBuilder str=new StringBuilder("");
        while(n!=0) {
            str.append(n%2L);
            n/=2L;
        }
        str=str.reverse();
        StringBuilder tmp_str=new StringBuilder("");
        int len=str.length();
        while(len!=30) {
            tmp_str.append("0");
            len++;
        }
        tmp_str.append(str);
        return tmp_str;
    }
    
    private static int binarySearchPM(int[] arr, int key){
        int n = arr.length;
        int mid = -1;
        int begin = 0,end=n;
        while(begin <= end){
            mid = (begin+end) / 2;
            if(mid == n){
                return n;
            }
            if(key < arr[mid]){
                end = mid-1;
            } else if(key > arr[mid]){
                begin = mid+1;
            } else {
                return mid;
            }
        }
        //System.out.println(begin+" "+end);
        return -begin; //expected Index
    }
    
    static class Reader { 
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