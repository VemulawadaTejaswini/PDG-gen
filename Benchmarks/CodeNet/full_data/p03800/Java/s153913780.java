import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private boolean isMenagerie = false;
    private int N;
    private String s;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void printArray (int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    private void initArray (int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    private void menagerie(int[] t) {
        for (int i = 1; i < s.length() - 1; i++) {
                String si = s.substring(i, i+1);
                int next = i + 1;
                int prev = i - 1;

                if ((t[i] == 1 && si.equals("o")) || (t[i] == 2 && si.equals("x"))) {
                    t[next] = t[prev];
                }
                if ((t[i] == 1 && si.equals("x")) || (t[i] == 2 && si.equals("o"))) {
                    t[next] = (t[prev] == 1) ? 2 : 1;
                }
            }
            int lastIndex = s.length() - 1;
            String start = s.substring(lastIndex, lastIndex+1);
            if ((t[lastIndex] == 1 && start.equals("o")) || (t[lastIndex] == 2 && start.equals("x"))) {
                if (t[0] != t[lastIndex-1]) isMenagerie = true;
            }
            if ((t[lastIndex] == 1 && start.equals("x")) || (t[lastIndex] == 2 && start.equals("o"))) {
                if (t[0] == t[lastIndex-1]) isMenagerie = true;
            }
    }

    private void solve() {
        try {
            N = scanner.nextInt();
            s = scanner.next();
            int[] t = new int[N];
            t[0] = 1; t[1] = 1;
            menagerie(t);
            if (isMenagerie) {
                isMenagerie = false;
                initArray(t);
                t[0] = 1; t[1] = 2;
                menagerie(t);
            } 
            if (isMenagerie) {
                isMenagerie = false;
                initArray(t);
                t[0] = 2; t[1] = 1;
                menagerie(t);
            } 
            if (isMenagerie) {
                isMenagerie = false;
                initArray(t);
                t[0] = 2; t[1] = 2;
                menagerie(t);
            }            
            if (isMenagerie) {
                System.out.println("-1");
            } else {
                String[] SW = new String[3];
                SW[1] = "S";
                SW[2] = "W";
                for (int i = 0; i < s.length(); i++) {
                    System.out.print(SW[t[i]]);
                }
                System.out.println();
            }

            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}