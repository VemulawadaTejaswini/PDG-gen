import javax.swing.plaf.basic.BasicViewportUI;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*new Thread(null, new Runnable() {
            @Override
            public void run() {
                try {
                    new Solver().solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }, "Solver", 1l << 30).start();*/

        new Solver().solve();
    }
}

class Solver {
    IO io = new IO(System.in, System.out);

    int N;
    TreeSet<Dish> Asorted, Bsorted;

    Comparator<Dish> com1 = new Comparator<Dish>() {
        @Override
        public int compare(Dish a, Dish b) {
            /*if (a.aval - a.bval != b.aval - b.bval)
                return Long.compare(a.aval - a.bval, b.aval - b.bval);
            else */if (a.aval != b.aval)
                return Long.compare(a.aval, b.aval);
            else if (a.bval != b.bval)
                return Long.compare(a.bval, b.bval);
            else return Integer.compare(a.ind, b.ind);
        }
    };
    Comparator<Dish> com2 = new Comparator<Dish>() {
        @Override
        public int compare(Dish a, Dish b) {
            /*if (a.bval - a.aval != b.bval - b.aval)
                return Long.compare(a.bval - a.aval, b.bval - b.aval);
            else */if (a.bval != b.bval)
                return Long.compare(a.bval, b.bval);
            else if (a.aval != b.aval)
                return Long.compare(a.aval, b.aval);
            else return Integer.compare(a.ind, b.ind);
        }
    };


    void solve() throws Exception {
        int i, j, k;

        N = io.nextInt();
        Asorted = new TreeSet<>(com1);
        Bsorted = new TreeSet<>(com2);

        for (i = 0; i < N; ++i) {
            Dish d = new Dish(i, io.nextLong(), io.nextLong());
            Asorted.add(d);
            Bsorted.add(d);
        }

        long Asum = 0, Bsum = 0;
        if (Asorted.size() != N || Bsorted.size() != N)
            System.exit(1);

        Dish selected, temp;
        for (i = 0; i < N; ++i) {
            if (i % 2 == 0) {
                selected = Asorted.last();
                temp = Bsorted.last();

                if (selected.aval <= temp.bval && selected.bval <= temp.aval)
                    selected = temp;

                Asum += selected.aval;
            } else {
                selected = Bsorted.last();
                temp = Asorted.last();

                if (selected.bval <= temp.aval && selected.aval <= temp.bval)
                    selected = temp;

                Bsum += selected.bval;
            }

            //System.out.println(selected.ind);
            Asorted.remove(selected); Bsorted.remove(selected);
        }
        if (!Asorted.isEmpty() || !Bsorted.isEmpty())
            System.exit(1);

        io.println(Asum - Bsum);

        io.flush();
    }
}

class Dish {
    int ind; long aval, bval;

    Dish(int i, long a, long b) {
        ind = i; aval = a; bval = b;
    }
}


class IO {
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static BufferedWriter bw;


    IO(InputStream is, OutputStream os) {
        try {
            in = is;
            bw = new BufferedWriter(new OutputStreamWriter(os));
        } catch (Exception e) {
        }
    }

    IO(String inputFile, String outputFile) {
        try {
            in = new FileInputStream(inputFile);
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile)));
        } catch (Exception e) {
        }
    }

    int scan() throws Exception {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a) throws Exception {
        bw.write(a.toString());
    }

    void println() throws Exception {
        bw.write("\n");
    }

    void println(Object a) throws Exception {
        print(a);
        println();
    }

    void flush() throws Exception {
        bw.flush();
        bw.close();
    }
}