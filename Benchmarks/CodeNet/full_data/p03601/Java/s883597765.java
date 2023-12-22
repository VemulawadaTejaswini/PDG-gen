/**
 * Created by Aminul on 9/16/2017.
 */

import java.io.*;
import java.util.*;


public class ARC083A {
    public static int a, b, c, d, e, f;
    static TreeSet<Integer> set;
    static HashSet<Integer> list;
    public static void main(String[] args)throws Exception {
        FastReader in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);


        a = in.nextInt(); b = in.nextInt();
        c= in.nextInt(); d = in.nextInt();
        e = in.nextInt(); f = in.nextInt();

        set = new TreeSet<>();
        list = new HashSet<>();

        gen_w(0);
        gen_s(0);

        debug(set);
        debug(list);

        int s = 0, sw = 0;

        double ratio = 0;

        for(int i : list){
            int need = need(i);
            Integer has = set.ceiling(need);
            if(has != null && has + i <= f){
                double dens = density(i, has);
                if(dens > ratio){
                    ratio = dens;
                    s = i;
                    sw = i + has;
                }

            }
        }


        pw.println(sw+ " "+s);


        pw.close();
    }

    static double density(int s, int w){
        return (100.0*s)/(s+w);
    }

    static int need(int x){
        double y = (100.*x)/e;
        return (int) Math.ceil(y);
    }

    static void gen_w(int x){
       // debug("w", x);
        if(x > f || set.contains(x)) return;
        set.add(x);
        gen_w(x+a*100);
        gen_w(x+b*100);
    }

    static void gen_s(int x){
       // debug("s", x);
        if(x > f || list.contains(x)) return;
        list.add(x);
        gen_s(x+c);
        gen_s(x+d);
    }



    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        public int lenbuf = 0, ptrbuf = 0;
        static final int ints[] = new int[128];

        public FastReader(InputStream is){
            for(int i='0';i<='9';i++) ints[i]=i-'0';
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
                if(lenbuf <= 0)return -1;
            }
            return inbuf[ptrbuf++];
        }

        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while((b = readByte()) != -1 && isSpaceChar(b));
            return b;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
//        public char nextChar() {
//            return (char)skip();
//        }

        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public int nextInt(){
            int num = 0, b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
            if(b == '-'){
                minus = true;
                b = readByte();
            }

            while(true){
                if(b >= '0' && b <= '9'){
                    num = (num<<3) + (num<<1) + ints[b];
                }else{
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
    }
}