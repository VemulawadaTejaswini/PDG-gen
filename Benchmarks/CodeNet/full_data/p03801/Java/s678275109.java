import java.io.*;
import java.util.*;

/**
 * @author Ivan Pryvalov (ivan.pryvalov@gmail.com)
 */
public class Main implements Runnable {

    static EventType eventType = EventType.DEFAULT;

    // Set T=0 if T should be read from input.
    // Set T=1 if there is only one testcase.
    static int T = 1;

    // Set it to `null' when the input is std in.
    static String inputFilename = null;


    // Set to true if you have prepared a large test with fake data.
    static boolean largeFakeTest = false;
    //Number of tests in the large fake test.
    static int largeFakeTest_T = 1;

    //--------------------------------------------------------------------

    static class Data{
        int idx;
        long value;
    }

    public static class Solver extends  SolverAbstract{

        int N;
        int[] A;
        @Override
        public void readInput() throws IOException {
            N = scanner.nextInt(); //10^5
            A = scanner.loadIntArray(N); // 10^9
        }

        @Override
        protected String solve() throws IOException {
            PriorityQueue<Data> queue = new PriorityQueue<>((o1,o2)->Long.compare(o2.value, o1.value));
            for (int i = 0; i < N; i++) {
                Data data = new Data();
                data.idx = i+1;
                data.value = A[i];
                queue.add(data);
            }
            long[] res = new long[N];
            int cnt = 0;
            while(!queue.isEmpty()){
                Data next = queue.remove();
                long curVal = next.value;
                int minIdx = next.idx;
                cnt++;
                while(!queue.isEmpty() && queue.peek().value == curVal){
                    next = queue.remove();
                    minIdx = Math.min(minIdx, next.idx);
                    cnt++;
                }
                long nextVal = 0;
                if (!queue.isEmpty()){
                    nextVal = queue.peek().value;
                }
                res[minIdx-1] = (curVal - nextVal) * cnt;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(res[i]).append("\n");
            }
            return sb.toString();
        }
    }

    // ------------- Some stardard tools that are currently not tested.

    static class Graph{
        int[][] G;
        int N;

        int[][] A;
        int[][] F;

        int[] path;
        int pathLen;
        boolean[] visited;
        int target;
        boolean flowFound;

        public Graph(int[][] g) {
            G = g;
            N = G.length;
        }

        public int[][] maxflow(int iSource, int iSink) {
            path = new int[N];
            visited = new boolean[N];

            A = new int[N][];
            for (int i = 0; i < N; i++) {
                A[i] = G[i].clone();
            }
            F = new int[N][N];

            target = iSink;
            //dfs from source to sink
            //increase path
            while(true){
                flowFound = false;
                visited[iSource] = true;
                pathLen = 0;
                path[pathLen++] = iSource;
                dfs(iSource);
                if (!flowFound)
                    break;
            }
            return F;
        }

        private void dfs(int u) {
            if (u==target){
                flowFound = true;
                for (int i = 0; i < pathLen-1; i++) {
                    int from = path[i];
                    int to  = path[i+1];
                    F[from][to]++;
                    F[to][from]--;
                }
            }else {
                for (int i = 0; i < N && !flowFound; i++) {
                    if (!visited[i] && A[u][i] > F[u][i]) {
                        visited[i] = true;
                        path[pathLen] = i;
                        pathLen++;
                        dfs(i);
                        visited[i] = false;
                        pathLen--;
                    }
                }
            }
        }
    }

    //--------------------------------------------------------------------

    private void solveAll() throws IOException, InterruptedException {
        long timeStart = System.currentTimeMillis();

        if (T==0) {
            if (largeFakeTest) {
                T = largeFakeTest_T;
            } else {
                T = scanner.nextInt();
            }
        }
        final String[] results = new String[T+1];
        for (int test = 0; test < T; test++) {
            Solver solver = new Solver(){
                @Override
                public void callback() {
                    results[testNo] = answer;
                }
            };
            solver.testNo = test+1;
            if (largeFakeTest) {
                solver.readFakeInput();
            }else{
                solver.readInput();
            }
            solver.solveWrapped();
        }

        long timeEnd = System.currentTimeMillis();
        if (isInputFromFile())
            System.out.println("All tasks are solved! Elapsed time "+(timeEnd-timeStart)/1000.0+" sec.");

        // write all responses in the proper order
        for (int i = 1; i <= T; i++) {
            if (eventType == EventType.GOOGLE_CODE_JAM){
                out.printf("Case #%d: %s", i, results[i]);
            }else {
                out.println(results[i]);
            }
        }
    }

    enum EventType{
        DEFAULT,
        GOOGLE_CODE_JAM
    }

    static boolean isInputFromFile() {
        return inputFilename != null;
    }

    public static abstract class SolverAbstract {
        int testNo;
        String answer = null;

        public void callback(){};

        public abstract void readInput() throws IOException;

        //generate a randomized test with the maximal input values
        public void readFakeInput() throws  IOException{
            throw new RuntimeException("not implemented");
        }

        protected abstract String solve() throws IOException;

        protected void solveWrapped() throws IOException {

            if (isInputFromFile())
                System.out.println("SOLVER: solving task #"+testNo+" out of "+ T+"...");

            answer = solve();
/*
            StringBuilder sbAnswer = new StringBuilder();
            sbAnswer.append(String.format("Case #%d:\n", testNo));
            good.forEach( (k,v) -> {
                sbAnswer.append(k).append(" ");
                for(int x:v){
                    sbAnswer.append(x).append(" ");
                }
                sbAnswer.append("\n");
            });


            answer = sbAnswer.toString();
*/

            if (isInputFromFile()) {
                System.out.println("\t"+answer);
            }
            callback();
        }

    }

    ////////////////////////////////////////////////////////

    /**
     * Source: http://stackoverflow.com/questions/4521983/java-executorservice-that-blocks-on-submission-after-a-certain-queue-size
     *
     * @param <E>
     */
//    public class LimitedQueue<E> extends LinkedBlockingQueue<E>{
//
//        public LimitedQueue(int maxSize) {
//            super(maxSize);
//        }
//
//        @Override
//        public boolean offer(E e){
//            // turn offer() and add() into a blocking calls (unless interrupted)
//            try {
//                put(e);
//                return true;
//            } catch(InterruptedException ie) {
//                Thread.currentThread().interrupt();
//            }
//            return false;
//        }
//    }

    /**
     * Move to Utilities
     *
     * //List<Integer> primesLimited = getPrimes(1_000_000).subList(0, 100);
     *
     * @param limit
     * @return
     */
    public static List<Integer> getPrimes(int limit) {
        boolean[] primes = new boolean[limit+1];
        Arrays.fill(primes, true);

        primes[1] = false;
        for(int i=2; i<=limit; i++){
            if (primes[i]){
                for(int j=i+i; j<=limit; j+=i){
                    primes[j] = false;
                }
            }
        }
        List<Integer> listPrimes = new ArrayList<>();
        for(int i=2; i<=limit; i++){
            if (primes[i]){
                listPrimes.add(i);
            }
        }
        return listPrimes;
    }


    public static class Modulo{
        long mod = (long)1e9+7;

        public Modulo(long mod) {
            super();
            this.mod = mod;
        }

        public long inv(long a) {
            long res =  pow(a, mod-2);
            return res;
        }

        public long pow(long a, long x) {
            if (x==0)
                return 1;
            long part = 1;
            if ((x&1)!=0)
                part = a;
            return (part * pow((a*a)%mod, x>>1)) % mod;
        }

        public long c(long n, long m){
            long res = 1;
            for(int i=1; i<=m; i++){
                res = (res * (n-m+i)) % mod;
                res = (res * inv(i)) % mod;
            }
            return res;
        }
    }

    /**
     * Added 26.04.2013.
     * See KROK 2013, Round 1, Problem D.
     */
    static class DisjointUnionSet implements Cloneable{
        int[] rank;
        int[] parent;

        protected DisjointUnionSet clone(){
            DisjointUnionSet cloned = new DisjointUnionSet(parent.length);
            for(int i=0; i<parent.length; i++){
                cloned.parent[i] = parent[i];
                cloned.rank[i] = rank[i];
            }
            return cloned;
        }

        public DisjointUnionSet(int n) {
            rank = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        @Override
        public String toString() {
            return "disj [parents=" + Arrays.toString(parent) + "]";
        }

        /**
         * Problem specific or general?
         * O(N * alpha)
         */
        public void union(DisjointUnionSet set2){
            for(int i=0; i<parent.length; i++){
                parent[find(i)] = parent[find(set2.find(i))];
            }
        }

        /**
         * @param index1 range 0..n-1
         * @param index2
         */
        public void union(int index1, int index2){
            int p1 = find(index1);
            int p2 = find(index2);
            if (rank[p1] > rank[p2]){
                parent[p2] = p1;
            }else if (rank[p2] > rank[p1]){
                parent[p1] = p2;
            }else{
                parent[p2] = p1;
                rank[p1]++;
            }
        }

        // O(alpha(n))
        private int find(int index) {
            if (parent[index] != index)
                parent[index] =  find(parent[index]);
            return parent[index];
        }

        // O(N alpha(N)) ==> see find()
        public int getCountDisjointSets(){
            int[] used = new int[parent.length];
            for(int i=0; i<parent.length; i++){
                used[find(i)] = 1;
            }
            int res = 0;
            for(int i=0; i<parent.length; i++){
                res += used[i];
            }
            return res;
        }
    }

    private static Random rnd = new Random();
    public static class ArrayUtils{
        public static void shuffle(int[] a){
            for(int j=a.length-1; j>=1; j--){
                int i = rnd.nextInt(j+1);
                swap(a, i, j);
            }
        }

        public static void swap(int[] a, int i, int j){
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
    }

    ////////////////////////////////////////////////////////
    /// Typically, you don't want to edit anything below
    ///////////////////////////////////////////////////////
    final int BUF_SIZE = 1024 * 1024 * 8;//important to read long-string tokens properly
    final int INPUT_BUFFER_SIZE = 1024 * 1024 * 8 ;
    final int BUF_SIZE_INPUT = 1024;

    final int BUF_SIZE_OUT = 1024;

    boolean useClassResourceTopDir = true;
    String outSuffix = ".out";

    //InputStream bis;
    //OutputStream bos;
    static PrintStream out;
    static ByteScanner scanner;
    static ByteWriter writer;

    public void run() {
        try{
            InputStream bis = null;
            OutputStream bos = null;
            if (inputFilename !=null){

                File inputFile = null;
                File outputFile = null;
                if (useClassResourceTopDir) {
                    File baseFile = new File(getClass().getResource("/").getFile());
                    inputFile = new File(baseFile, inputFilename);
                    outputFile = new File(baseFile, inputFilename +outSuffix);
                }else{
                    inputFile = new File(inputFilename);
                    outputFile = new File(inputFilename +outSuffix);
                }
                System.out.println("Input file canonical path: "+inputFile.getCanonicalPath());
                bis = new BufferedInputStream(
                        new FileInputStream(inputFile),
                        INPUT_BUFFER_SIZE);
                bos = new BufferedOutputStream(new FileOutputStream(outputFile));
                out = new PrintStream(bos);
            }else{
                bis = new BufferedInputStream(System.in, INPUT_BUFFER_SIZE);
                bos = new BufferedOutputStream(System.out);
                out = new PrintStream(bos);
            }
            scanner = new ByteScanner(bis, BUF_SIZE_INPUT, BUF_SIZE);
            writer = new ByteWriter(bos, BUF_SIZE_OUT);

            solveAll();
            out.flush();
        }catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public interface Constants{
        byte ZERO = '0';//48 or 0x30
        byte NINE = '9';
        byte SPACEBAR = ' '; //32 or 0x20
        byte MINUS = '-'; //45 or 0x2d

        char FLOAT_POINT = '.';
    }

    public static class EofException extends IOException{
    }

    public static class ByteWriter implements Constants {

        int bufSize = 1024;
        byte[] byteBuf = new byte[bufSize];
        OutputStream os;

        public ByteWriter(OutputStream os, int bufSize){
            this.os = os;
            this.bufSize = bufSize;
        }

        public void writeInt(int num) throws IOException{
            int byteWriteOffset = byteBuf.length;
            if (num==0){
                byteBuf[--byteWriteOffset] = ZERO;
            }else{
                int numAbs = Math.abs(num);
                while (numAbs>0){
                    byteBuf[--byteWriteOffset] = (byte)((numAbs % 10) + ZERO);
                    numAbs /= 10;
                }
                if (num<0)
                    byteBuf[--byteWriteOffset] = MINUS;
            }
            os.write(byteBuf, byteWriteOffset, byteBuf.length - byteWriteOffset);
        }

        /**
         * Please ensure ar.length <= byteBuf.length!
         *
         * @param ar
         * @throws IOException
         */
        public void writeByteAr(byte[] ar) throws IOException{
            for (int i = 0; i < ar.length; i++) {
                byteBuf[i] = ar[i];
            }
            os.write(byteBuf,0,ar.length);
        }

        public void writeSpaceBar() throws IOException{
            byteBuf[0] = SPACEBAR;
            os.write(byteBuf,0,1);
        }

    }

    public static class ByteScanner implements Constants{

        InputStream is;

        public ByteScanner(InputStream is, int bufSizeInput, int bufSize){
            this.is = is;
            this.bufSizeInput = bufSizeInput;
            this.bufSize = bufSize;

            byteBufInput = new byte[this.bufSizeInput];
            byteBuf = new byte[this.bufSize];
        }

        public ByteScanner(byte[] data){
            byteBufInput = data;
            bufSizeInput = data.length;
            bufSize = data.length;
            byteBuf = new byte[bufSize];
            byteRead = data.length;
            bytePos = 0;
        }

        private int bufSizeInput;
        private int bufSize;

        byte[] byteBufInput;
        byte by=-1;
        int byteRead=-1;
        int bytePos=-1;

        byte[] byteBuf;
        int totalBytes;

        boolean eofMet = false;

        private byte nextByte() throws IOException{

            if (bytePos<0 || bytePos>=byteRead){
                byteRead = is==null? -1: is.read(byteBufInput);
                bytePos=0;
                if (byteRead<0){
                    byteBufInput[bytePos]=-1;//!!!
                    if (eofMet)
                        throw new EofException();
                    eofMet = true;
                }
            }
            return byteBufInput[bytePos++];
        }

        /**
         * Returns the next meaningful character as byte.<br>
         *
         * @return
         * @throws IOException
         */
        public byte nextChar() throws IOException{
            while ((by=nextByte())<=0x20);
            return by;
        }

        /**
         * Returns the next meaningful character OR space as byte.<br>
         *
         * @return
         * @throws IOException
         */
        public byte nextCharOrSpacebar() throws IOException{
            while ((by=nextByte())<0x20);
            return by;
        }

        /**
         * Reads line.
         *
         * @return
         * @throws IOException
         */
        public String nextLine() throws IOException {
            readToken((byte)0x20);
            return new String(byteBuf,0,totalBytes);
        }

        public byte[] nextLineAsArray() throws IOException {
            readToken((byte)0x20);
            byte[] out = new byte[totalBytes];
            System.arraycopy(byteBuf, 0, out, 0, totalBytes);
            return out;
        }

        /**
         * Reads token. Spacebar is separator char.
         *
         * @return
         * @throws IOException
         */
        public String nextToken() throws IOException {
            readToken((byte)0x21);
            return new String(byteBuf,0,totalBytes);
        }

        /**
         * Spacebar is included as separator char
         *
         * @throws IOException
         */
        private void readToken() throws IOException {
            readToken((byte)0x21);
        }

        private void readToken(byte acceptFrom) throws IOException {
            totalBytes = 0;
            while ((by=nextByte())<acceptFrom);
            byteBuf[totalBytes++] = by;
            while ((by=nextByte())>=acceptFrom){
                byteBuf[totalBytes++] = by;
            }
        }

        public int nextInt() throws IOException{
            readToken();
            int num=0, i=0;
            boolean sign=false;
            if (byteBuf[i]==MINUS){
                sign = true;
                i++;
            }
            for (; i<totalBytes; i++){
                num*=10;
                num+=byteBuf[i]-ZERO;
            }
            return sign?-num:num;
        }

        public long nextLong() throws IOException{
            readToken();
            long num=0;
            int i=0;
            boolean sign=false;
            if (byteBuf[i]==MINUS){
                sign = true;
                i++;
            }
            for (; i<totalBytes; i++){
                num*=10;
                num+=byteBuf[i]-ZERO;
            }
            return sign?-num:num;
        }

		/*
		//TODO test Unix/Windows formats
		public void toNextLine() throws IOException{
			while ((ch=nextChar())!='\n');
		}
		*/

        public double nextDouble() throws IOException{
            readToken();
            char[] token = new char[totalBytes];
            for (int i = 0; i < totalBytes; i++) {
                token[i] = (char)byteBuf[i];
            }
            return Double.parseDouble(new String(token));
        }

        public int[] loadIntArray(int size) throws IOException{
            int[] a = new int[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] loadLongArray(int size) throws IOException{
            long[] a = new long[size];
            for (int i = 0; i < a.length; i++) {
                a[i] = nextLong();
            }
            return a;
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}