import java.io.*;
import java.time.Year;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
    final static int[] dx9 = {-1, -1, -1,  0,  0, 0, 1, 1,1};
    final static int[] dy9 = {-1, 0, 1, -1, 0, 1, -1, 0,1};
    final static Runnable me=()->{};
    public static void solve(){
        //TODO:Solve problem like ***
        Scanner sc=new Scanner();
        final Direction[] ds={Direction.U,Direction.L,Direction.D,Direction.R};
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final int b = sc.nextInt();
        final int gy = sc.nextInt(); //change
        final int gx = sc.nextInt(); //change
        final FixedIntPair goal = new FixedIntPair(gx, gy); //change
        final int[] ry = new int[m];
        final int[] rx = new int[m];
        final Direction[] c = new Direction[m];
        for(int i=0;i<m;i++){
            ry[i] = sc.nextInt();
            rx[i] = sc.nextInt();
            c[i] = Direction.valueOf(sc.next());
        }
        final int[] by = new int[b];
        final int[] bx = new int[b];
        for(int i=0;i<b;i++){
            by[i] = sc.nextInt();
            bx[i] = sc.nextInt();
        }

        List<Thi> bestList = new ArrayList<>();
        long maxScore=0;
        for (int offsetX = 0; offsetX < n; offsetX++) {
            for (int offsetY = 0; offsetY < n; offsetY++) {
                final int gy_ = nor(gy-offsetY, n);
                final int gx_ = nor(gx-offsetX, n);
//                put("gy_:" + gy_ + ",gx_:" + gx_);
                final FixedIntPair goal_ = new FixedIntPair(gx_, gy_);
                final int[] ry_ = new int[m];
                final int[] rx_ = new int[m];
                for (int i = 0; i < m; i++) {
                    ry_[i] = nor(ry[i]-offsetY, n);
                    rx_[i] = nor(rx[i]-offsetX, n);
                }
                final int[] by_ = new int[b];
                final int[] bx_ = new int[b];
                for (int i = 0; i < b; i++) {
                    by_[i] = nor(by[i]-offsetY, n);
                    bx_[i] = nor(bx[i]-offsetX, n);
                }

                //ここから
                final Deque<HaveKouhoFIP> deq = new ArrayDeque<>();
                deq.add(new HaveKouhoFIP(null,goal_));
                final List<Integer> y = new ArrayList<>();
                final List<Integer> x = new ArrayList<>();
                final List<Direction> r = new ArrayList<>();


                boolean[][] isUsed=new boolean[n][n];
                final boolean[][] isBlock = new boolean[n][n];
                for (int i = 0; i < b; i++) {
                    isBlock[bx_[i]][by_[i]]=true;
                }
                while(deq.size()>0){
                    final HaveKouhoFIP current = deq.removeFirst();
                    final FixedIntPair currentPosition = current.current;

                    if(isUsed[currentPosition.x][currentPosition.y]){
                        continue;
                    }
                    if(currentPosition!=goal_){
                        assert current.dire!=null;
                        y.add(currentPosition.y);
                        x.add(currentPosition.x);
                        r.add(current.dire);
                        isUsed[currentPosition.x][currentPosition.y]=true;
                    }
                    if(current.dire==Direction.L||current.dire==Direction.R||current.dire==null){

                        for (int i = nor(currentPosition.y + 1, n); i != nor(currentPosition.y - 1, n) && !isBlock[currentPosition.x][i]; i=nor(i+1,n)) {
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.U,new FixedIntPair(currentPosition.x,i));
                            deq.addLast(kouho);
                        }
                        for (int i = nor(currentPosition.y - 1, n); i != nor(currentPosition.y + 1, n) && !isBlock[currentPosition.x][i]; i=nor(i-1,n)) {
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.D,new FixedIntPair(currentPosition.x,i));
                            deq.addLast(kouho);
                        }
                        for(int i=nor(currentPosition.x+1,n);i!=nor(currentPosition.x-1,n)&&!isBlock[i][currentPosition.y];i=nor(i+1,n)){
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.L,new FixedIntPair(i,currentPosition.y));
                            deq.addLast(kouho);
                        }
                        for(int i=nor(currentPosition.x-1,n);i!=nor(currentPosition.x+1,n)&&!isBlock[i][currentPosition.y];i=nor(i-1,n)){
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.R,new FixedIntPair(i, currentPosition.y));
                            deq.addLast(kouho);
                        }
                    }else{
                        for(int i=nor(currentPosition.x+1,n);i!=nor(currentPosition.x-1,n)&&!isBlock[i][currentPosition.y];i=nor(i+1,n)){
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.L,new FixedIntPair(i,currentPosition.y));
                            deq.addLast(kouho);
                        }
                        for(int i=nor(currentPosition.x-1,n);i!=nor(currentPosition.x+1,n)&&!isBlock[i][currentPosition.y];i=nor(i-1,n)){
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.R,new FixedIntPair(i, currentPosition.y));
                            deq.addLast(kouho);
                        }
                        for (int i = nor(currentPosition.y + 1, n); i != nor(currentPosition.y - 1, n) && !isBlock[currentPosition.x][i]; i=nor(i+1,n)) {
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.U,new FixedIntPair(currentPosition.x,i));
                            deq.addLast(kouho);
                        }
                        for (int i = nor(currentPosition.y - 1, n); i != nor(currentPosition.y + 1, n) && !isBlock[currentPosition.x][i]; i=nor(i-1,n)) {
                            HaveKouhoFIP kouho = new HaveKouhoFIP(Direction.D,new FixedIntPair(currentPosition.x,i));
                            deq.addLast(kouho);
                        }
                    }
                }
                final Direction[][] map = new Direction[n][n];
                for(int i=0;i<x.size();i++){
                    map[x.get(i)][y.get(i)] = r.get(i);
                }
                final boolean[][] isPassed = new boolean[n][n];
                final boolean[][] isMean=new boolean[n][n];
                int A=0;
                int B=0;
                int C=0;
                for(int i=0;i<m;i++){
                    int xx=rx_[i];
                    int yy=ry_[i];
                    Direction d = c[i];
                    isMean[xx][yy]|=(d!=map[xx][yy]);
                    while(!(xx==goal_.x&&yy==goal_.y)&&(!(isBlock[xx][yy]))){
                        final Direction prev=d;
                        d=(map[xx][yy]==null)?d:map[xx][yy];
                        if(prev!=d){
                            isMean[xx][yy]=true;
                        }
                        isPassed[xx][yy]=true;
                        switch (d){
                            case D:
                                yy++;
                                break;
                            case U:
                                yy--;
                                break;
                            case L:
                                xx--;
                                break;
                            case R:
                                xx++;
                                break;
                        }
                        xx = nor(xx, n);
                        yy = nor(yy, n);
                    }
                    if(xx==goal_.x&&yy==goal_.y){
                        A++;
                    }
                }

                final List<Thi> list = new ArrayList<>();
                for(int i=0;i<x.size();i++){
                    if(isPassed[x.get(i)][y.get(i)]&&isMean[x.get(i)][y.get(i)]){
                        list.add(new Thi(nor(x.get(i)+offsetX,n), nor(y.get(i)+offsetY,n), r.get(i)));
                    }
                }
                B=list.size();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(isPassed[i][j]){
                            C++;
                        }
                    }
                }

                long score = 1000 * A - 10 * B + C;
                if(maxScore<score){
                    bestList=list;
                    maxScore=score;
                }
            }
        }

        put(formatAns(bestList));

    }
    private static String formatAns(List<Thi> list){
        StringBuilder sb = new StringBuilder();
        sb.append(list.size());
        sb.append('\n');
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i).y);
            sb.append(' ');
            sb.append(list.get(i).x);
            sb.append(' ');
            sb.append(list.get(i).d);
            sb.append('\n');
        }
        return sb.toString();
    }

    /**
     * mod n world
     * @param x
     * @param n
     * @return
     */
    private static int nor(int x,int n){
        while(x<0){
            x+=n;
        }
        return x%n;
    }
    static class Thi{
        int x;
        int y;
        Direction d;
        Thi(int x,int y,Direction d){
            this.x=x;
            this.y=y;
            this.d=d;
        }

    }
    static class HaveKouhoFIP{
        final Direction dire;
        final FixedIntPair current;
        HaveKouhoFIP(Direction dire,FixedIntPair current){
            this.dire=dire;
            this.current=current;
        }
    }
    private enum Direction{
        U,D,L,R;

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
