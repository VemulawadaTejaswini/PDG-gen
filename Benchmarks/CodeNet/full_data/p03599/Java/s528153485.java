import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        int f=scanner.nextInt();
        List<Integer> water=new ArrayList<>();
        List<Integer> suger=new ArrayList<>();
        suger.add(0);
        for(int i=0;100*a*i<=f;i++){
            for(int j=0;100*a*i+100*b*j<=f;j++){
                int val=100*a*i+100*b*j;
                if(val==0)continue;
                if(!water.contains(val))water.add(val);
            }
        }
        for(int i=0;c*i<=f;i++){
            for(int j=0;c*i+d*j<=f;j++){
                int val=c*i+d*j;
                if(!suger.contains(val))suger.add(val);
            }
        }
        Collections.sort(water);
        Collections.sort(suger);
        List<Pair> resultList=new ArrayList<>();
        for(Integer wVal:water){
            int sIndex=~Collections.binarySearch(suger,Math.min((f-wVal),e*wVal/100),new UpperBoundComparator<>());
            int sVal=suger.get(sIndex-1);
            resultList.add(new Pair(wVal+sVal,sVal));
        }
        Pair maxP=resultList.stream().max(Comparator.comparing((Pair pair) -> pair.y*100/pair.x)).orElse(new Pair(0,0));
        put(format("%d %d",maxP.x,maxP.y));



    }

    public static void put(Object object) {
        System.out.println(object);
    }
    public static String format(String string, Object... args) {
        return String.format(string, args);
    }
}

final class Scanner {
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

final class Pair {
    final public int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return x+y;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=super.equals(obj);
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Pair pair=(Pair)obj;
        if(this.x==pair.x&&this.y==pair.y) return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
final class Tuple<T,V>{
    final public T t;
    final public V v;
    Tuple(T t,V v){
        this.t=t;
        this.v=v;
    }

    @Override
    public int hashCode() {
        return (t.hashCode()+v.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=this.getClass()){
            return false;
        }
        Tuple<T,V> tuple=(Tuple)obj;
        return tuple.t.equals(this.t)&&tuple.v.equals(this.v);
    }

    @Override
    public String toString() {
        return String.format("<Tuple>=<%s,%s>",t,v);
    }
}
final class LowerBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) >= 0) ? 1 : -1;
    }
}

final class UpperBoundComparator<T extends Comparable<? super T>>
        implements Comparator<T>
{
    public int compare(T x, T y)
    {
        return (x.compareTo(y) > 0) ? 1 : -1;
    }
}
