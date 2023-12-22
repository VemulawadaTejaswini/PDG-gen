import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int n=fsc.nextInt();
        int c=fsc.nextInt();
        int[][] p=new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) p[i][j]=fsc.nextInt();
        fsc.close();
        Arrays.sort(p, new C());
        ArrayList<Recorder> recorders=new ArrayList<Recorder>();
        int count=0;
        boolean addRecorder=true;
        for(int[] program:p){
            if(count==0){
                recorders.add(new Recorder(p[0][2], p[0][1]));
                count++;
                continue;
            }
            for(Recorder r:recorders){
                if(program[2]==r.c){
                    r.t=program[1];
                    addRecorder=false;
                    break;
                }
                else{
                    if(program[0]>r.t){
                        r.c=program[2];
                        r.t=program[1];
                        addRecorder=false;
                        break;
                    }
                }
            }
            if(addRecorder) recorders.add(new Recorder(program[2], program[1]));
            count++;
            addRecorder=true;
        }
        System.out.println(recorders.size());
    }
    static class Recorder{
        int c;
        int t;
        public Recorder(int c, int t){
            this.c=c;
            this.t=t;
        }
    }

    static class C implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2){
            if(o1[0]>o2[0]) return 1;
            else if(o1[0]<o2[0]) return -1;
            else return 0;
        }
    }

    static class FastScanner {
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
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}