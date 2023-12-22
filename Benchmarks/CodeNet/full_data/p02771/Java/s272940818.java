import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//javac Main.java & java Main showTrace:1 runOnEditor:0 inputFromLocal:1 outputToLocal:0
//javac Main.java ; java Main showTrace:1 runOnEditor:1 inputFromLocal:0 outputToLocal:0
public class Main extends Core {
   protected static final int MOD = (int) 1E9 + 7;

   public Main(String[] args) {
      super(args);
   }

   public static void main(String[] args) {
      new Main(args);
   }

   @Override
   protected void solve() throws Exception {
      int[] arr = ni(3);
      Arrays.sort(arr);
      println(((arr[0] == arr[1] && arr[1] != arr[2]) || (arr[0] != arr[1] && arr[1] == arr[2])) ? "Yes" : "No");
   }
}

abstract class Core {
   protected abstract void solve() throws Exception;

   private static final int BUFFER_SIZE = (1 << 13);
   private static final int WHITE_SPACE = 32;
   private static final byte[] IN_BUFFER = new byte[BUFFER_SIZE];
   private static final byte[] OUT_BUFFER = new byte[BUFFER_SIZE];

   private int inNextByte;
   private int inNextIndex;
   private int inReadByteCount;
   private int outNextIndex;
   private InputStream in = System.in;
   private OutputStream out = System.out;
   private PrintStream info = System.err;

   private boolean showTrace;
   private boolean runOnEditor;
   private boolean inputFromLocal;
   private boolean outputToLocal;

   protected Core(String[] args) {
      try {
         start(args);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }

   private void start(String[] args) throws Exception {
      if (args != null) {
         if (args.length > 0) {
            showTrace = "1".equals(args[0].split(":")[1]);
         }
         if (args.length > 1) {
            runOnEditor = "1".equals(args[1].split(":")[1]);
         }
         if (args.length > 2) {
            inputFromLocal = "1".equals(args[2].split(":")[1]);
         }
         if (args.length > 3) {
            outputToLocal = "1".equals(args[3].split(":")[1]);
         }
      }

      if (inputFromLocal) {
         String fs = File.separator;
         String root = new File("").getAbsolutePath();
         String inPath = String.format("%s%s%s", root, fs, "in.txt");

         if (runOnEditor) {
            inPath = String.format("%s%s%s%s%s%s%s", root, fs, "src", fs, "testdata", fs, "in.txt");
         }
         if (showTrace) {
            info.println("Input: " + inPath);
         }

         in = new FileInputStream(inPath);
      }
      else if (showTrace) {
         info.println("Input: Console");
      }

      if (outputToLocal) {
         String fs = File.separator;
         String root = new File("").getAbsolutePath();
         String outPath = String.format("%s%s%s", root, fs, "out.txt");

         if (runOnEditor) {
            outPath = String.format("%s%s%s%s%s%s%s", root, fs, "src", fs, "testdata", fs, "out.txt");
         }
         if (showTrace) {
            info.println("Output: " + outPath);
         }

         out = new FileOutputStream(outPath);
      }
      else if (showTrace) {
         info.println("Output: Console");
      }

      long start = 0;

      if (showTrace) {
         start = System.currentTimeMillis();
      }

      nextByte();
      solve();
      in.close();
      flushOutBuf();

      if (showTrace) {
         info.printf("\nSolve completed in %.3f [s]\n", (System.currentTimeMillis() - start) / 1000.0);
      }
   }

   private int nextByte() throws IOException {
      if (inNextIndex >= inReadByteCount) {
         inReadByteCount = in.read(IN_BUFFER, 0, BUFFER_SIZE);

         if (inReadByteCount == -1) {
            return (inNextByte = -1);
         }

         inNextIndex = 0;
      }

      return (inNextByte = IN_BUFFER[inNextIndex++]);
   }

   protected final char nc() throws IOException {
      while (inNextByte <= WHITE_SPACE) {
         nextByte();
      }

      char res = (char) inNextByte;
      nextByte();

      return res;
   }

   protected final int ni() throws IOException {
      int res = 0;

      while (inNextByte <= WHITE_SPACE) {
         nextByte();
      }

      boolean minus = (inNextByte == '-');

      if (minus) {
         nextByte();
      }
      if (inNextByte < '0' || inNextByte > '9') {
         throw new RuntimeException("Invalid integer value format to read");
      }

      do {
         res = (res << 1) + (res << 3) + inNextByte - '0';
      }
      while (nextByte() >= '0' && inNextByte <= '9');

      return minus ? -res : res;
   }

   protected final long nl() throws IOException {
      long res = 0;

      while (inNextByte <= WHITE_SPACE) {
         nextByte();
      }

      boolean minus = (inNextByte == '-');

      if (minus) {
         nextByte();
      }
      if (inNextByte < '0' || inNextByte > '9') {
         throw new RuntimeException("Invalid long value format to read");
      }

      do {
         res = (res << 1) + (res << 3) + inNextByte - '0';
      }
      while (nextByte() >= '0' && inNextByte <= '9');

      return minus ? -res : res;
   }

   protected final double nd() throws IOException {
      double pre = 0.0, suf = 0.0, div = 1.0;

      while (inNextByte <= WHITE_SPACE) {
         nextByte();
      }

      boolean minus = (inNextByte == '-');

      if (minus) {
         nextByte();
      }
      if (inNextByte < '0' || inNextByte > '9') {
         throw new RuntimeException("Invalid double value format to read");
      }

      do {
         pre = 10 * pre + (inNextByte - '0');
      }
      while (nextByte() >= '0' && inNextByte <= '9');

      if (inNextByte == '.') {
         while (nextByte() >= '0' && inNextByte <= '9') {
            suf += (inNextByte - '0') / (div *= 10);
         }
      }

      return minus ? -(pre + suf) : (pre + suf);
   }

   protected final String ns() throws IOException {
      while (inNextByte <= WHITE_SPACE) {
         nextByte();
      }

      StringBuilder sb = new StringBuilder();

      while (inNextByte > WHITE_SPACE) {
         sb.append((char) inNextByte);
         nextByte();
      }

      return sb.toString();
   }

   protected final char[] nc(int n) throws IOException {
      char[] a = new char[n];

      for (int i = 0; i < n; ++i) {
         a[i] = nc();
      }

      return a;
   }

   protected final char[][] nc(int r, int c) throws IOException {
      char[][] a = new char[r][c];

      for (int i = 0; i < r; ++i) {
         a[i] = nc(c);
      }

      return a;
   }

   protected final int[] ni(int n) throws IOException {
      int[] a = new int[n];

      for (int i = 0; i < n; ++i) {
         a[i] = ni();
      }

      return a;
   }

   protected final int[][] ni(int r, int c) throws IOException {
      int[][] a = new int[r][c];

      for (int i = 0; i < r; ++i) {
         a[i] = ni(c);
      }

      return a;
   }

   protected final long[] nl(int n) throws IOException {
      long[] a = new long[n];

      for (int i = 0; i < n; ++i) {
         a[i] = nl();
      }

      return a;
   }

   protected final long[][] nl(int r, int c) throws IOException {
      long[][] a = new long[r][c];

      for (int i = 0; i < r; ++i) {
         a[i] = nl(c);
      }

      return a;
   }

   protected final double[] nd(int n) throws IOException {
      double[] a = new double[n];

      for (int i = 0; i < n; ++i) {
         a[i] = nd();
      }

      return a;
   }

   protected final double[][] nd(int r, int c) throws IOException {
      double[][] a = new double[r][c];

      for (int i = 0; i < r; ++i) {
         a[i] = nd(c);
      }

      return a;
   }

   protected final String[] ns(int n) throws IOException {
      String[] a = new String[n];

      for (int i = 0; i < n; ++i) {
         a[i] = ns();
      }

      return a;
   }

   protected final String[][] ns(int r, int c) throws IOException {
      String[][] a = new String[r][c];

      for (int i = 0; i < r; ++i) {
         a[i] = ns(c);
      }

      return a;
   }

   private final void flushOutBuf() {
      try {
         if (outNextIndex <= 0) {
            return;
         }
         out.write(OUT_BUFFER, 0, outNextIndex);
         out.flush();
         outNextIndex = 0;
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   protected final void print(String s) {
      if (s == null) {
         s = "null";
      }
      for (int i = 0, N = s.length(); i < N; ++i) {
         OUT_BUFFER[outNextIndex++] = (byte) s.charAt(i);

         if (outNextIndex >= BUFFER_SIZE) {
            flushOutBuf();
         }
      }
   }

   protected final void println(String s) {
      print(s);
      print('\n');
   }

   protected final void print(Object obj) {
      if (obj == null) {
         print("null");
      }
      else {
         print(obj.toString());
      }
   }

   protected final void println(Object obj) {
      print(obj);
      print('\n');
   }

   protected final void print(String format, Object... args) {
      if (args != null) {
         format = String.format(format, args);
      }
      print(format);
   }

   protected final void println(String format, Object... args) {
      if (args != null) {
         format = String.format(format, args);
      }
      println(format);
   }

   protected final void debug(String format, Object... args) {
      if (args != null) {
         format = String.format(format, args);
      }
      info.print(format);
   }

   protected final void debugln(String format, Object... args) {
      if (args != null) {
         format = String.format(format, args);
      }
      info.println(format);
   }
}
