import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
    private static StringBuilder sb = new StringBuilder();
    private static void s(String s){
        System.out.print(s);
    }
    private static void s(Double s){
        System.out.print(s);
    }
    private static void s(char s){
        System.out.print(s);
    }
    private static void sn(String s){
        System.out.println(s);
    }
    private static void sn(Boolean s){
        System.out.println(s);
    }
    private static void sn(long s){
        System.out.println(s);
    }
    private static void sn(Double s){
        System.out.println(s);
    }
    private static void sn(String s, Object o){
        sb.append(s+"\n");
    }
    private static void sn(long s, Object o){
        sb.append(s+"\n");
    }
    private static void sn(boolean s, Object o){
        sb.append(s+"\n");
    }
    private static void pr(){
        System.out.print(sb);
    }
    static class Reader{
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
    private static boolean isPrime(Integer ii){
        return new BigInteger(ii+"").isProbablePrime(1);
    }
    private static boolean isDigit(int ii){
        return Character.isDigit((char)ii);
    }
    private static long fact(int f){
        if(f==0){
            return 1;
        }
        return (long)f * (long)fact(f-1);
    }
    /*static int ar[] = new int[1000000];
    static {
        Arrays.fill(ar, 1000070);
        ar[0]=0;
        int arrr[] = new int[]{2,3,5,7};
        for(int i=0;i<4;i++){
            for(int ii=0;ii<1000000;ii++){
                if(ii>=arrr[i]){
                    ar[ii] = Math.min(ar[ii], 1+ar[ii-arrr[i]]);
                }
            }
        }
    }*/
    /*static{
        Arrays.fill(prime, true);
        for(int p = 2; p*p <=1000070; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= 1000070; i += p)
                    prime[i] = false;
            }
        }
        int nc = 0;
        for(int p = 2; p <=1000070; p++)
        {
            if(prime[p] == true && prime[(p+1)/2] == true)
            {
                prr[p]+=nc+1;
                nc = prr[p];
            }
        }
    }*/
    private static Reader r = new Reader();
    private static int ni() throws Exception{
        return r.nextInt();
    }
    private static long nl() throws Exception{
        return r.nextLong();
    }
    private static int[] na(int a) throws Exception{
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = r.nextInt();
        }
        return arr;
    }
    private static boolean isSquare(int a){
        double sqt = Math.sqrt(a);
        return (int)sqt == sqt;
    }
    private static int lSquare(int a){
        double sqt = Math.sqrt(a);
        return (int)sqt * (int) sqt;
    }
    private static int rSquare(int a){
        double sqt = Math.sqrt(a);
        return (int)Math.ceil(sqt) * (int)Math.ceil(sqt);
    }
	public static void main (String[] args) throws Exception{
	    int n = ni();
	    int a = ni();
	    int b = ni();
	    while(true){
	        if(a+1!=b){
	            a = a+1;
	        } else {
	            if(a-1>0){
	                a = a-1;
	            } else {
	                sn("Borys");
	                return;
	            }
	        }
	        if(b-1!=a){
	            b = b - 1;
	        } else {
	            if(b+1<n){
	                b = b+1;
	            } else {
	                sn("Alice");
	                return;
	            }
	        }
	    }
	}
}