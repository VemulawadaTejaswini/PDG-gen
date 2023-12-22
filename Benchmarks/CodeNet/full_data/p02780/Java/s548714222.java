import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDiceInLine solver = new DDiceInLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDiceInLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            ArrayList<Integer> dices = new ArrayList<>();
            while (in.hasNext()) {
                dices.add(in.nextInt());
            }
            ArrayList<Integer> select_dices = new ArrayList<>();

            for (int i = 0; i < n - k; i++) {
                ArrayList<Integer> select_dices_buff = new ArrayList<>();
                int index = i;
                while (select_dices_buff.size() != k) {
                    select_dices_buff.add(dices.get(index));
                    index++;
                }
                if (listTotal(select_dices) < listTotal(select_dices_buff)) {
                    select_dices = select_dices_buff;
                }

            }

            double total = 0;
            for (int eye : select_dices) {
                total = total + avg(eye);
            }

            out.println(total);
        }

        int listTotal(ArrayList<Integer> list) {
            int total = 0;
            for (Integer integer : list) {
                total = total + integer;
            }
            return total;
        }

        double avg(int eye) {
            double total = 0;
            for (int i = 0; i <= eye; i++) {
                total = total + i;
            }
            return total / (double) eye;
        }

    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;

        public Scanner(InputStream in) {
            this.in = in;
            this.buffer = new byte[1024];
            this.ptr = 0;
            this.buflen = 0;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isPrintableChar(byte c) {
            return '!' <= c && c <= '~';
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
            boolean minus = false;
            byte b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
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

    }
}

