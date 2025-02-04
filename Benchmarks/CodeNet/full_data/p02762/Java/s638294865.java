
import java.io.*;
import java.util.*;
import java.math.*;

public class Main { 
    static HashSet<Integer>[] grp;
    static HashSet<Integer>[] grp2;
    static boolean[] vis;
    static boolean[] vis2;
    static HashSet<Integer> cont;
    static HashSet<Integer> cont2;
    public static void main(String[] args) throws java.lang.Exception { 
        Reader pm =new Reader(); 
        //Scanner pm = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        while(t-- > 0){
            int n = pm.nextInt();
            int m = pm.nextInt();
            int k = pm.nextInt();
            grp = new HashSet[n+1];
            grp2 = new HashSet[n+1];
            vis = new boolean[n+1];
            vis2 = new boolean[n+1];
            for(int i=1;i<=n;i++)
                grp[i] = new HashSet<>();
            for(int i=1;i<=n;i++)
                grp2[i] = new HashSet<>();
            while(m-- > 0){
                int a = pm.nextInt();
                int b = pm.nextInt();
                grp[a].add(b);
                grp[b].add(a);
            }   
            HashMap<Integer, HashSet<Integer>> mem = new HashMap<>();
            for(int i=1;i<=n;i++){
                if(!vis[i]){
                    cont = new HashSet<>();
                    dfs(i);
                    for(int j:cont){
                        // HashSet<Integer> rem = new HashSet<>();
                        // if(mem.get(j) != null)
                        //     rem = mem.get(j);
                        mem.put(j, cont);   
                    }
                }
            }
            while(k-- > 0) {

                int a = pm.nextInt();
                int b = pm.nextInt();
                HashSet<Integer> rem = mem.get(a);
                if(rem.contains(b)){
                    grp2[a].add(b);
                    grp2[b].add(a);
                }
            }
            vis = new boolean[n+1];
            TreeMap<Integer, Integer> hm = new TreeMap<>();
            for(int i=1;i<=n;i++){
                if(!vis[i]) {
                    cont = new HashSet<>();
                    dfs(i);
                    //System.out.println(cont+" "+cont2);
                    // for(int j:cont) {
                    //     if(!cont2.contains(j)){
                    //         cont2.remove((Integer)j);
                    //     }
                    // }
                    
                    for(int j:cont) {

                        int pl = Math.abs((cont.size()-1)-grp[j].size()-grp2[j].size());
                        hm.put(j,pl);
                        System.out.println(j+" "+pl);
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            for(int i:hm.keySet()) {
                sb.append(hm.get(i)+" ");
            }
            System.out.println(sb);
        }
        //end of tests
        
    }
    //end of main class
    static void dfs(int v) {
        vis[v] = true;
        cont.add(v);
        for(int i:grp[v]){
            if(!vis[i])
                dfs(i);
        }
    }
    static void dfs2(int v) {
        vis2[v] = true;
        cont2.add(v);
        for(int i:grp2[v]){
            if(!vis2[i])
                dfs2(i);
        }
    }
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