import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        long k=fsc.nextLong()*n-1;
        int[] a=new int[n];
        HashMap<Integer, ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=fsc.nextInt();
            if(!map.containsKey(a[i])){
                map.put(a[i], new ArrayList<>());
            }
            map.get(a[i]).add(i);
        }
        fsc.close();
        int[] next=new int[n];
        int[] len=new int[n];
        for(int i=0;i<n;i++){
            List<Integer> list=map.get(a[i]);
            int l=0, r=list.size();
            while(r-l>1){
                int m=l+(r-l)/2;
                if(list.get(m)<=i) l=m;
                else r=m;
            }
            next[i]=list.get((l+1)%list.size());
            if(i<next[i]){
                len[i]=next[i]-i;
            } else{
                len[i]=next[i]-i+n;
            }
        }
        // System.out.println("next:");
        // for(int i=0;i<n;i++){
        //     System.out.print(i+": "+next[i]+", ");
        // }
        // System.out.println();
        // System.out.println("len:");
        // for(int i=0;i<n;i++){
        //     System.out.print(i+": "+len[i]+", ");
        // }
        // System.out.println();
        int begin=-1, end=-1;
        long loop=-1;
        int now=0;
        boolean[] visit=new boolean[n];
        visit[now]=true;
        long d=0;
        long sub=0;
        while(true){
            int nxt=next[now];
            d+=len[now];
            now=(nxt+1)%n;
            if(!visit[now]){
                d++;
                visit[now]=true;
            } else{
                begin=now;
                end=nxt;
                int nw=0;
                while(true){
                    if(nw==now){
                        break;
                    }
                    int nx=next[nw];
                    sub+=len[nw];
                    nw=(nx+1)%n;
                    sub++;
                }
                loop=d-sub+1;
                break;
            }
        }
        if(n==1){
            System.out.println(a[0]);
            return;
        }
        // System.out.println("begin: "+begin);
        // System.out.println("end: "+end);
        // System.out.println("sub: "+sub);
        // System.out.println("loop: "+loop);
        // System.exit(0);
        int nw;
        if(k<sub){
            nw=0;
        } else{
            k-=sub;
            k%=loop;
            nw=begin;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(true){
            //System.out.println("now: "+nw+" , k: "+k);
            if(k>=len[nw]){
                k-=len[nw];
                if(k==0){
                    break;
                }
                nw=(next[nw]+1)%n;
                k--;
                if(k==0){
                    ans.add(a[nw]);
                    break;
                }
            } else{
                ans.add(a[nw]);
                nw=(nw+1)%n;
                k--;
                if(k==0){
                    ans.add(a[nw]);
                    break;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int s:ans){
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
    

    static class FastScanner {
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
}
