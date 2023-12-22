import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        final long MAX=1_000_000_000;
        FastScanner fsc=new FastScanner();
        int q=fsc.nextInt();
        long bsum=0;
        long min=0;
        int m=0;
        TreeSet<Long> fir=new TreeSet<>((u,v)->u>=v?1:-1);
        fir.add(-MAX);
        TreeSet<Long> sec=new TreeSet<>((u,v)->u>=v?1:-1);
        sec.add(MAX);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<q;++i){
            int query=fsc.nextInt();
            if(query==1){
                ++m;
                Long am=fsc.nextLong(), bm=fsc.nextLong();
                bsum+=bm;
                long fl=fir.last();
                long sf=sec.first();
                if(!(fl<am && sf>am)){
                    min+=Math.min(Math.abs(fl-am), Math.abs(sf-am));
                    if(fl>=am){
                        if(m%2==1) sec.add(fir.last());
                        else fir.pollLast();
                        fir.add(am);
                    }
                    else{
                        if(m%2==1) fir.add(sec.first());
                        else sec.pollFirst();
                        sec.add(am);
                    }
                }
                else{
                    fir.add(am);
                    sec.add(am);
                }
                while(fir.size()-sec.size()>1) sec.add(fir.pollLast());
                while(sec.size()-fir.size()>1) fir.add(sec.pollFirst());
            }
            else sb.append(fir.last()).append(" ").append(min+bsum).append("\n");
        }
        fsc.close();
        System.out.print(sb);
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr<buflen) return true;
        else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }
            catch(IOException e){
                e.printStackTrace();
            }
            if(buflen<=0) return false;
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
        if (b < '0' || '9' < b) throw new NumberFormatException();
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }
            else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
            else throw new NumberFormatException();
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
    public void close(){
        try{in.close();}
        catch(IOException e){e.printStackTrace();}
    }
}