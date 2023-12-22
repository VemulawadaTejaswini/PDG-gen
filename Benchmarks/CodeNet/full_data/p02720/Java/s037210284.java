import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int BIG_NUMBER = 100000000;
        long LARGE_NUMBER = 10000000000000000L;
        
        int k = sc.nextInt();
        int count=0;
        long moving=0;
        
        int[][] dp = new int[10][10]; //n桁目がiの時のn(lunlun)
        
    	for(int i=0; i<10; i++){
    	    dp[0][i]=1;
    	}
    	for(int i=1; i<10; i++){
    		for(int j=0; j<10; j++){
    		    dp[i][j] = dp[i-1][j];
    		    if(j>0) dp[i][j] += dp[i-1][j-1];
    		    if(j<9) dp[i][j] += dp[i-1][j+1];
    		}
    	}
    	for(int i=0; i<10; i++){
    	    dp[i][0]--;
    	    
    	}
    	
    	int nsum=0, overD=0, over_top=0;
    	outern:
    	for(int i=0; i<10; i++){
    		for(int j=1; j<10; j++){
    		    nsum+=dp[i][j];
    		    if(nsum>=k){
    		        nsum-=dp[i][j];
    		        //out.println(nsum);
    		        overD=i;
    		        over_top=j;
    		        if(over_top==0){
    		            over_top=9;
    		            overD--;
    		        }
                    moving+=(long)Math.pow(10,overD);
                	moving*=(long)over_top;
                	break outern;
    		    }
    		}
    	}
    	overD--;
    	outer:
    	for(int i=overD; i>=0; i--){
    		for(int j=0; j<10; j++){
    		    if(abs(over_top-j)>1) continue;
    		    //out.println(i+":"+j);
    		    nsum+=dp[i][j];
    		    //out.println(nsum);
    		    if(nsum>=k){
    		        //out.println(nsum);
    		        nsum-=dp[i][j];
    		        over_top=j;
    		        moving+=(long)(Math.pow(10,i)*over_top);
    		        continue outer;
    		    }
    		}
    	}
    	
    	
    	
    	out.println(moving);
        out.flush();
    }
    
    private static boolean lunlun(long num){
        String s_ver=Long.toString(num);
        int dig=s_ver.length();
        if(dig==1) return true;
        for(int i=1; i<dig; i++){
            if(absL((s_ver.charAt(i-1))-(s_ver.charAt(i)))>1) return false;
        }
        return true;
    }
    
    private static int pow2(int in){
        return in*in;
    }
    private static long pow2(long in){
        return in*in;
    }
    
    private static int minExcept(int[] dt, int ex, char mode){
        int min=Integer.MAX_VALUE;
        
        if(mode =='a'){
        	for(int i=0; i<dt.length; i++){
        	    if((i != ex) && (dt[i] < min)) min = dt[i];
        	}
        }else if(mode =='v'){
        	for(int i=0; i<dt.length; i++){
        	    if((dt[i] != ex) && (dt[i] < min)) min = dt[i];
        	}
        }
    	return min;
    }
    private static long minExcept(long[] dt, int ex, char mode){
        long min=Long.MAX_VALUE;
        
        if(mode =='a'){
        	for(int i=0; i<dt.length; i++){
        	    if((i != ex) && (dt[i] < min)) min = dt[i];
        	}
        }else if(mode =='v'){
        	for(int i=0; i<dt.length; i++){
        	    if((dt[i] != ex) && (dt[i] < min)) min = dt[i];
        	}
        }
    	return min;
    }
    
    private static int abs(int a){
        if(a>=0) return a;
        else return -a;
    }
    private static long absL(long a){
        if(a>=0) return a;
        else return -a;
    }
    private static int min(int a, int b){
        if(a>b) return b;
        else return a;
    }
    private static long minL(long a, long b){
        if(a>b) return b;
        else return a;
    }
    private static int min2(int... ins){
        int min = ins[0];
        
    	for(int i=1; i<ins.length; i++){
    	    if(ins[i] < min) min = ins[i];
    	}
    	return min;
    }
    private static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }
    private static long max(long a, long b){
        if(a>b) return a;
        else return b;
    }
    private static int max2(int... ins){
        int max = ins[0];
        
    	for(int i=1; i<ins.length; i++){
    	    if(ins[i] > max) max = ins[i];
    	}
    	return max;
    }
    
    
    static void show_i2d_array(long[][] dt){
        PrintWriter out = new PrintWriter(System.out);
    	for(int i=0; i<dt[0].length; i++){
    		for(int j=0; j<dt.length; j++){
    		    out.print(dt[j][i]+",");
    		}
    		out.println("<-city="+i);
    	}
    	out.flush();
    }
    
    public static void combSort(int[][] origin, int ln){
        int h=ln*10/13, tmp=0;
        boolean fin=true;
        while((h>1)||(!fin)){
            fin=true;
            for(int i=0; i < ln-h; i++){
                if(origin[i][0] > origin[i+h][0]){
                    tmp=origin[i][0];
                    origin[i][0]=origin[i+h][0];
                    origin[i+h][0]=tmp;
                    tmp=origin[i][1];
                    origin[i][1]=origin[i+h][1];
                    origin[i+h][1]=tmp;
                    fin=false;
                }
            }
            h *=10;
            h/=13;
        }
    }
}
 
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}