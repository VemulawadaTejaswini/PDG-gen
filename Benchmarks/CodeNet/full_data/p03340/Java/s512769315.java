import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int n = sc.nextInt();
    long cnt = 0;
    List<Long> sumNums = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      int j = 0;
      int listSize = sumNums.size();
      for (; j < listSize;j++) {
        long sumNum = sumNums.get(j);
        long sum = sumNum + a;
        long xor = sumNum^a;
        if (xor == sum) {
          cnt++;
          sumNums.set(j, sum);
          continue;
        }
        break; 
      }
      if (j < sumNums.size()) {
        if (j == 0) sumNums = new ArrayList<>();
        else sumNums = sumNums.subList(0, j);
      }
      sumNums.add(0, a);
    }
    cnt+=n;
    System.out.println(cnt);
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
            } catch (Exception e) {
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
        if (!hasNext()) return "";
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) return -1;
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