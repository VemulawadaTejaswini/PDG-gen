import java.util.*;
import static java.util.Objects.isNull;

import java.io.*;


public class Main{
   public static void main(String[] args){
        FastScanner fsc = new FastScanner();
        int n=fsc.nextInt();
        int[] nummap=new int[n];
        for(int i=0;i<n;i++) nummap[fsc.nextInt()-1]++;
        int[] num=new int[n+1];
        for(int i=0;i<n;i++) num[nummap[i]]++;
        PairQueue org=new PairQueue(n);
        for(int i=1;i<=n;i++) if(num[i]>0) org.addLast(new Pair(i, num[i]));
        StringBuilder sb=new StringBuilder();
        for(int m=1;m<=n;m++){
            PairQueue now=org.clone();
            int cnt=0;
            // System.out.println(m);
            Out:while(true){
                // for(int i=now.head;i<now.tail;i++){
                //     for(int j=0;j<now.a[i].v;j++){
                //         System.out.print(now.a[i].k+" ");
                //     }
                // }
                // System.out.println();
                int k=m;
                PairQueue next=new PairQueue(n);
                In:while(true){
                    Pair p=now.pollLast();
                    if(isNull(p)) break Out;
                    if(p.v<k){
                        k-=p.v;
                        if(p.k>1) next.addLast(new Pair(p.k-1, p.v));
                    } else{
                        if(next.size()!=0 && next.getLast().k==p.k) next.getLast().v+=p.v-k;
                        else next.addLast(new Pair(p.k, p.v-k));
                        if(p.k>1){
                            if(now.size()!=0 && now.getLast().k==p.k-1) now.getLast().v+=k;
                            else next.addLast(new Pair(p.k-1, k));
                        }
                        break In;
                    }
                }
                while(next.size()!=0) now.addLast(next.pollLast());
                cnt++;
            }
            // System.out.println();
            sb.append(cnt).append('\n');
        }
        System.out.print(sb);
   }
}

class Pair implements Cloneable{
    public int k, v;
    public Pair(int k, int v){
        this.k=k;
        this.v=v;
    }
    public Pair clone(){
        return new Pair(k, v);
    }
}

class PairQueue implements Cloneable{
    public Pair[] a;
    public int head = 0, tail = 0;

    public PairQueue(int max) {
        a=new Pair[max+30];
    }

    public void addLast(Pair x) {
        a[tail++]=x;
    }

    public Pair pollFirst() {
        if(tail==head) return null;
        return a[head++];
    }

    public Pair pollLast() {
        if(tail==head) return null;
        return a[tail---1];
    }

    public Pair getFirst() {
        return a[head];
    }

    public Pair getLast() {
        return a[tail-1];
    }

    public int size() {
        return tail-head;
    }

    public void init() {
        head=tail=0;
    }

    private PairQueue(int head, int tail, Pair[] a){
        this.head=head;
        this.tail=tail;
        this.a=new Pair[a.length];
        for(int i=head;i<tail;i++) this.a[i]=a[i].clone();
    }
    public PairQueue clone(){
        return new PairQueue(head, tail, a);
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
