import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        //...0110110110...or...000...でなければならない
        int n_cap = sc.nextInt();
        int[] written_num = new int[n_cap];
        
        boolean possible = true;
        boolean all0 = true;
        boolean[][] numB = new boolean[n_cap][32];
        
        for(int i=0; i<n_cap; i++){
            written_num[i] = sc.nextInt();
            if(written_num[i] > 0) all0 = false;
            numB[i] = intToBool(written_num[i]);
        }
        //show_b2d_array(numB);
        if(all0){
        }else if(n_cap%3 > 0){
            possible = false;
        }else{
            boolean[] is_all0d = new boolean[32];
            int count = 0;
            for(int dig=0; dig<32; dig++){
                count = 0;
                for(int i=0; i<n_cap; i++){
                    if(!numB[i][dig]) count++;
                }
                if(count == n_cap){
                    is_all0d[dig] = true;
                }else if(count == (n_cap/3)){
                    is_all0d[dig] = false;
                }else{
                    possible = false;
                    break;
                }
            }
            int[] g1 = new int[n_cap/3];
            int[] g2 = new int[n_cap/3];
            boolean g1found=false, g2_found = false;
            for(int dig=0; dig<32; dig++){
                //out.println(is_all0d[dig]);
                if(possible && (!is_all0d[dig])){
                    if(!g1found){
                        count=0;
                        for(int i=0; i<n_cap; i++){
                            if(!numB[i][dig]){
                                g1[count] = i;
                                count++;
                                g1found=true;
                            }
                        }
                    }else if(!g2_found){
                        for(int i=0; i<n_cap; i++){
                            if(!numB[i][dig]){
                                if(i!=g1[0]){
                                    g2_found=true;
                                    break;
                                }
                            }
                        }
                        count=0;
                        for(int i=0; i<n_cap; i++){
                            if(!numB[i][dig]){
                                if(g2_found){
                                    g2[count] = i;
                                    count++;
                                }else{
                                    if(i != g1[count]){
                                        possible=false;
                                        break;
                                    }
                                    count++;
                                }
                            }
                        }
                    }else{
                        boolean g1desu = false;
                        for(int i=0; i<n_cap; i++){
                            if(!numB[i][dig]){
                                if(i==g1[0]){
                                    g1desu=true;
                                    break;
                                }
                                break;
                            }
                        }
                        count=0;
                        for(int i=0; i<n_cap; i++){
                            if(!numB[i][dig]){
                                if(g1desu){
                                    if(i != g1[count]){
                                        possible=false;
                                        break;
                                    }
                                }else{
                                    if(i != g2[count]){
                                        possible=false;
                                        break;
                                    }
                                }
                                    count++;
                            }
                        }
                    }
                }
            }
        }
        
        if(possible) out.println("Yes");
        else out.println("No");
        out.flush();
        //int count_continent=0;
        /*int[] ts_in = new int[n_v];
        int[] ts_out = new int[n_v];
        for(int i=0; i<n_v; i++){
            ts_in[i] = -1;
            ts_out[i] = -1;
        }*/
        
        /*ArrayDeque<Integer> todo = new ArrayDeque<>();
        todo.add(0);
        
        int deal_with = 0, tmp_togo=-1;
        while(todo.size() > 0){
            deal_with = todo.removeFirst();
            for(int i=0; i<plain_graph.get(deal_with).size(); i++){
                tmp_togo = plain_graph.get(deal_with).get(i);
                if(d_from1[tmp_togo] < 0){
                    d_from1[tmp_togo] = d_from1[deal_with]+1;
                    todo.add(tmp_togo);
                }
            }
        }
        
        for(int i=0; i<n_v; i++){
            out.println((i+1) + " " + d_from1[i]);
        }*/
    }
    
    static void show_b2d_array(boolean[][] dt){
    	for(int i=0; i<dt.length; i++){
    		for(int j=0; j<dt[0].length; j++){
    		    if(dt[i][j]) System.out.print("O");
    		    else System.out.print(".");
    		}
    		System.out.println();
    	}
    }
    
    public static boolean[] intToBool(int a){
        boolean[] bs = new boolean[32];
        for(int dig=0; dig<32; dig++){
            bs[dig] = ((a&(1<<dig)) > 0) ? true : false;
        }
        return bs;
    }
    
    
    
    public static int binarySearchMax(int[] dt, int target){
        int left=-1, right=dt.length;
        int mid=-1;
        
        while((right-left)>1){
            mid = left + (right-left)/2;
            
            if(dt[mid] <= target){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left;  //target以下の最大のaddress
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