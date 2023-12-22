import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long np = 0, nz = 0, nn = 0;
        ArrayList<Long> ap = new ArrayList<Long>();
        ArrayList<Long> an = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] > 0){
                np++;
                ap.add(a[i]);
            }else if(a[i] == 0){
                nz++;
            }else{
                nn++;
                an.add(a[i]);
            }
        }

        long nnp = np * (np - 1) / 2 + nn * (nn - 1) / 2;
        long nnz = nz * (np + nn) + nz * (nz - 1) / 2;
        long nnn = np * nn;
        // System.out.println(nnp + nnz + nnn);
        if(k <= nnn){
            Collections.sort(an);
            Collections.sort(ap, (ia, ib) -> -1 * Long.compare(ia, ib));
            long ml = -1000000000000000005L, mr = 0;
            while(mr >= ml + 1){
                long mm = (ml + mr) / 2;
                int nums = 0, numl = 0;
                for(long map: ap){
                    int mml = -1, mmr = an.size();
                    while(mmr > mml + 1){
                        int mmm = (mmr + mml) / 2;
                        long man = an.get(mmm);
                        if(map * man < mm){
                            mml = mmm; 
                        }else{
                            mmr = mmm;
                        }
                    }
                    nums += mml+1;
                    mml = -1;
                    mmr = an.size();
                    while(mmr > mml + 1){
                        int mmm = (mmr + mml) / 2;
                        long man = an.get(mmm);
                        if(map * man <= mm){
                            mml = mmm; 
                        }else{
                            mmr = mmm;
                        }
                    }
                    numl += mml + 1;
                }
                if(nums < k && k <= numl){
                    System.out.println(mm);
                    break;
                }else if(nums >= k){
                    mr = mm;
                }else{
                    ml = mm + 1;
                }
            }
        }else if(k <= nnn + nnz){
            System.out.println(0);
        }else{

            Collections.sort(ap);
            long ml = 0, mr = 1000000000000000005L;
            long mk = k - nnn - nnz;
            while(mr >= ml + 1){
                long mm = (ml + mr) / 2;
                int nums = 0, numl = 0;
                ArrayList<Long> mmap = (ArrayList<Long>)ap.clone();
                for(long map: ap){
                    mmap.remove(map);

                    int mml = -1, mmr = mmap.size();
                    while(mmr > mml + 1){
                        int mmm = (mmr + mml) / 2;
                        long man = mmap.get(mmm);
                        if(map * man < mm){
                            mml = mmm; 
                        }else{
                            mmr = mmm;
                        }
                    }
                    nums += mml+1;
                    mml = -1;
                    mmr = mmap.size();
                    while(mmr > mml + 1){
                        int mmm = (mmr + mml) / 2;
                        long man = mmap.get(mmm);
                        if(map * man <= mm){
                            mml = mmm; 
                        }else{
                            mmr = mmm;
                        }
                    }
                    numl += mml + 1;
                    mmap.add(map);
                }
                if(nums < mk && mk <= numl){
                    System.out.println(mm);
                    break;
                }else if(nums >= mk){
                    mr = mm;
                }else{
                    ml = mm + 1;
                }
            }
        }


    }

    private static class FastScanner {
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
}

