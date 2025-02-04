import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        solve();
    }
    final static int INF = Integer.MAX_VALUE>>1;
    final static int MOD = 1_000_000_007;
    final static int[] dx4 = { 0, 1, 0, -1 };
    final static int[] dy4 = { 1, 0, -1, 0 };
    final static int[] dx8 = {0, 1, 1,  1,  0, -1, -1, -1};
    final static int[] dy8 = {1, 1, 0, -1, -1, -1, 0, 1};
    final static Runnable me=()->{};
    public static void solve(){
        //TODO:Solve problem like ***
        Scanner sc=new Scanner();
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
        }
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i,new HashSet<>());
        }
        for (int i = 0; i < n - 1; i++) {
            graph.get(a[i]).add(b[i]);
            graph.get(b[i]).add(a[i]);
        }
        int[] parent = new int[n];
        int[] childNum = new int[n];
        int nn=childNum(graph,parent,childNum,0);
        assert nn==n:String.format("%d!=%d",nn,n);
        runWhenEA(func("parent",Arrays.toString(parent)));
        runWhenEA(func("childNum",Arrays.toString(childNum)));
        List<Integer> toRootPath = new ArrayList<>();
        toRootPath.add(n - 1);
        for(int current=n-1;parent[current]!=0;){
            int next = parent[current];
            toRootPath.add(next);
            current=next;
        }
        runWhenEA(func("toRootPath",toRootPath));
        int sunuke=childNum[toRootPath.get((toRootPath.size()-1)/2)]+1;
        if (sunuke >= (n - sunuke)) {
            put("Snuke");
        }else{
            put("Fennec");
        }

    }
    static int childNum(Map<Integer,Set<Integer>> graph,int[] parent,int[] childNum,int node){
        for(int nextNode:graph.get(node)){
            if(parent[node]==nextNode)continue;
            parent[nextNode]=node;
            childNum[node]+=childNum(graph,parent,childNum,nextNode);
        }
        return childNum[node];

    }

    //runWhenEAで使う
    private static Runnable func(Object... objects){
        try{
            assert false;
            return me;
        }catch(AssertionError e){
            return ()->{put(objects);};
        }
    }
    private static void print(Object... objects){
        if(objects.length==1){
            System.out.print(objects[0]);
        }else{
            System.out.print(Arrays.toString(objects));
        }
    }
    private static void put(Object... objects) {
        print(objects);
        put();
    }
    private static void put(){
        System.out.println();
    }


    private static void runWhenEA(Runnable runnable){
        try{
            assert false;
        }catch(AssertionError e){
            PrintStream ps=System.out;
            PrintStream pse=System.err;
            System.setOut(pse);
            runnable.run();
            System.setOut(ps);
        }
    }
    private static void putM(String name,char[][] mat){
        put("---------------------"+name+"-----------------");
        for (int i = 0; i < mat.length; i++) {
            put(Arrays.toString(mat[i]));
        }
    }
    private static void putM(String name,int[][] mat){
        put("---------------------"+name+"-----------------");
        for (int i = 0; i < mat.length; i++) {
            put(Arrays.toString(mat[i]));
        }
    }
    private static void putM(String name,long[][] mat){
        put("---------------------"+name+"-----------------");
        for (int i = 0; i < mat.length; i++) {
            put(Arrays.toString(mat[i]));
        }
    }
    private static void putM(String name,boolean[][] mat){
        put("---------------------"+name+"-----------------");
        for (int i = 0; i < mat.length; i++) {
            put(Arrays.toString(mat[i]));
        }
    }
    final static private class Scanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
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

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
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
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
    final static private class FixedIntPair {
        final public int x, y;
        final static public FixedIntPair ZEROS=new FixedIntPair(0,0);
        FixedIntPair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public static double distance(FixedIntPair fip1,FixedIntPair fip2){
            double x = (double) fip1.x - fip2.x;
            double y = (double) fip1.y - fip2.y;
            return Math.sqrt(x*x+y*y);
        }

        @Override
        public int hashCode() {
            return x*100000+y;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null)return false;
            if(!(obj instanceof FixedIntPair)) return false;
            FixedIntPair pair=(FixedIntPair) obj;
            return this.x==pair.x&&this.y==pair.y;
        }

        @Override
        public String toString() {
            return format(FixedIntPair.class.getSimpleName()+":(%d,%d)", x, y);
        }
    }
    final static private class FixedLongPair {
        final public long x, y;
        final static public FixedLongPair ZEROS=new FixedLongPair(0,0);
        FixedLongPair(long x, long y) {
            this.x = x;
            this.y = y;
        }
        public static double distance(FixedLongPair flp1,FixedLongPair flp2){
            double x = (double) flp1.x - flp2.x;
            double y = (double) flp1.y - flp2.y;
            return Math.sqrt(x*x+y*y);
        }

        @Override
        public int hashCode() {
            return (int)x+(int)y;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj==null)return false;
            if(!(obj instanceof FixedLongPair)) return false;
            FixedLongPair pair=(FixedLongPair)obj;
            return this.x==pair.x&&this.y==pair.y;
        }

        @Override
        public String toString() {
            return format(FixedLongPair.class.getSimpleName()+":(%d,%d)", x, y);
        }
    }
    final static private class Binary{
        public static String toZeroPadding(int i){
            return format("%"+Integer.toBinaryString(-1).length()+"s",Integer.toBinaryString(i)).replace(' ','0');
        }
        public static String toZeroPadding(long i){
            return format("%"+Long.toBinaryString(-1).length()+"s",Long.toBinaryString(i)).replace(' ','0');
        }
    }

    final static private class Util {
        static long gcd(long a,long b){
            a= abs(a);
            b= abs(b);
            if(a<b){
                long tmp=a;
                a=b;
                b=tmp;
            }
            while(b!=0){
                long r=a%b;
                a=b;
                b=r;
            }
            return a;
        }
        static int gcd(int a,int b){
            a= abs(a);
            b= abs(b);
            if(a<b){
                int tmp=a;
                a=b;
                b=tmp;
            }
            while(b!=0){
                int r=a%b;
                a=b;
                b=r;
            }
            return a;
        }
        static long lcm(long a,long b){
            long gcd=gcd(a,b);
            long result=b/gcd;
            return a*result;
        }
        static boolean isValidCell(int i,int j,int h,int w){
            return i>=0&&i<h&&j>=0&&j<w;
        }
    }
}































































/*
......................................................................................................................................
.....................................  ________ ____ __________________________________________ .....................................
..................................... /  _____/|    |   \      \__    ___/\_   _____/\______   \.....................................
...................................../   \  ___|    |   /   |   \|    |    |    __)_  |       _/.....................................
.....................................\    \_\  \    |  /    |    \    |    |        \ |    |   \.....................................
..................................... \______  /______/\____|__  /____|   /_______  / |____|_  /.....................................
.....................................        \/                \/                 \/         \/ .....................................
......................................................................................................................................
.............................................................,;'';:...................................................................
........................................................+@@@@@@@@@@@@@@'..............................................................
.....................................................#@@@##############@@@:...........................................................
...................................................@@@####################@@,.........................................................
.................................................@@#########################@@........................................................
...............................................:@############################@@.......................................................
..............................................@@######@@@#';;'#@@@############@@:.....................................................
.............................................@#####@@,````````````,@@###########@:....................................................
............................................@####@;``````````````````+@##########@....................................................
...........................................@###@:``````````````````````#@########@@...................................................
..........................................@####``````````````````````````@########@@..................................................
.........................................###@.````````````````````````````@########@+.................................................
.........................................@#@```````````````````````````````#########@.................................................
........................................@#@`````````````````````````````````########@@................................................
.......................................,@@```````````````````````````````````@#######@:...............................................
.......................................@@`````````````````````````````````````@#######@...............................................
.......................................@:````````````````````#@@'``````````````@######@+..............................................
......................................#@```````````````````@@@@@@@#````````````########@..............................................
......................................@```````````````````@@@@@@@@@@````````````@######@+.............................................
......................................@``````````````````@@@@@@@+   +```````````+#######@.............................................
.....................................;:``````````````````@@@@@@@    @````````````@######@'............................................
.....................................@``````````````````:@@@@@@@    @````````````@#######@............................................
.....................................@```,@@@#``````````;@@@@@@@    @````````````:#######@:...........................................
.....................................@``@@@@@@@@````````.@@@@@@@#  ,#`````````````@#######@...........................................
.....................................@`@@@@@@@+'@````````@@@@@@@@@@@``````````````@#######@...........................................
.....................................@,@@@@@@   ,```:+:``:@@@@@@@@@.``````````````@########@..........................................
.....................................#@@@@@@@  ;@@#;,,,@``:@@@@@@@````````````````#########@..........................................
.....................................+@@@@@@@@',,,,,,,,;,```.'+;``````````````````'########@;.........................................
.....................................'@@@@',,,,,,,,,,,,,@`````````````````````````:#########@.........................................
....................................:@#,,,,,:;;;;;:,,,,,@`````````````````````````.#########@.........................................
.................................:@#@@@@#++';;;;;;;;;;;;@``````````````````````````##########+........................................
...............................#@#+;;;;;;;;;;;;;;;;;;;;':``````````````````````````##########@........................................
....................................,@#@@@@@#+'';;;;;+@#```````````````````````````##########@........................................
.....................................@``````````.,,,.``````````````````````````````############.......................................
.....................................@`````````````````````````````````````````````#######+'+#@.......................................
.....................................@`````````````````````````````````````````````##########'@.......................................
.....................................#`````````````````````````````````````````````############@#.....................................
.....................................:.````````````````````````````````````````````##############@,...................................
......................................+```````````````````````````````````````````.###############@#..................................
......................................@```````````````````````````````````````````.################@@.................................
......................................@```````````````````````````````````````````.###+##############@................................
......................................@```````````````````````````````````````````.###+###############@...............................
......................................',``````````````````````````````````````````.####'##############@@..............................
.......................................@```````````````````````````````````````````#####+##############@:.............................
.......................................@```````````````````````````````````````````#####'###############@.............................
.......................................@```````````````````````````````````````````######'################............................
.......................................#,``````````````````````````````````````````#######'##############@............................
........................................@``````````````````````````````````````````@######++##############+...........................
........................................@``````````````````````````````````````````@#######'##############@...........................
........................................@``````````````````````````````````````````@########'#############@...........................
.......................................@#'`````````````````````````````````````````@#########'##############..........................
.......................................@#@`````````````````````````````````````````+#########+'############@..........................
......................................@##@`````````````````````````````````````````.##########+'###########@..........................
......................................@##@:`````````````````````````````````````````###########+'###########..........................
.....................................:@###@`````````````````````````````````````````@###########+'+#########,.........................
.....................................@####@`````````````````````````````````````````@#############''########..........................
.....................................@####@.````````````````````````````````````````;##############+'######@..........................
.....................................@#####@`````````````````````````````````````````################@@@###+..........................
.....................................@#####@`````````````````````````````````````````@###############@..;;............................
....................................,@#####@.````````````````````````````````````````+################'...............................
....................................:#######@`````````````````````````````````````````################@...............................
....................................:#######@`````````````````````````````````````````@###############@...............................
....................................,@#######,````````````````````````````````````````:###############@...............................
.....................................@######@@`````````````````````````````````````````@##############@...............................
.....................................@######@@`````````````````````````````````````````+##############@...............................
.....................................@#####@,;;`````````````````````````````````````````@#############@...............................
.....................................@####@@..@`````````````````````````````````````````+#############@...............................
.....................................,####@...@``````````````````````````````````````````@############+...............................
......................................@##@.....@`````````````````````````````````````````:###########@,...............................
.......................................@+......@``````````````````````````````````````````@##########@................................
...............................................:#``````````````````````````````````````````##########@................................
................................................@``````````````````````````````````````````+########@,................................
................................................'+``````````````````````````````````````````@#######@.................................
.................................................@```````````````````````````````````````````@#####@:.................................
.................................................'#``````````````````````````````````````````.#####@..................................
..................................................@```````````````````````````````````````````;###@...................................
...................................................@```````````````````````````````````````````+#@'...................................
...................................................'#```````````````````````````````````````````@#....................................
....................................................##`````````````````````````````````````````@#.....................................
.....................................................#@```````````````````````````````````````@+......................................
......................................................:@;```````````````````````````````````;@,.......................................
.......................................................;@@'```````````````````````````````:@@+;.......................................
.......................................................@,,'@@'``````````````````````````@@@,,,@.......................................
......................................................@,,,,,,'@@@@;````````````````.+@@@;,,,,,@.......................................
......................................................#@+@,,,,,,,,+@@@@@@@@@@@@@@@@@;,,,,,'@@@........................................
.........................................................+,,,#',,@@..............@,,,,,,,,@...........................................
..........................................................@@@,#@@,...............:+,,,'@,,@...........................................
..................................................................................@,,,@.##............................................
...................................................................................@;@................................................
....................................................................................:.................................................
......................................................................................................................................
......................................................................................................................................
 */