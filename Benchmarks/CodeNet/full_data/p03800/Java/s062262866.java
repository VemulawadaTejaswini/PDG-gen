import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;

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

    private void solve() {
        try {
            int N = scanner.nextInt();
            String s = scanner.next();
            int[] t = new int[N];
            t[0] = 1;
            if (s.substring(0, 1).equals("o")) {
                t[N-1] = t[1] = 1;
            } else {
                t[N-1] = 1;
                t[1] = 2;
            }
            boolean isMenagerie = false;
            for (int i = 1; i < s.length(); i++) {
                String si = s.substring(i, i+1);
                int next = i + 1;
                int prev = i - 1;
                if (i == 0) {
                    prev = N - 1;
                }
                if (i == N - 1) {
                    next = 0;
                }
                if ((t[i] == 1 && si.equals("o")) || (t[i] == 2 && si.equals("x"))) {
                    if (t[next] == 0) {
                        t[next] = t[prev];
                    } else {
                        isMenagerie = (t[next] != t[prev]) ? true : false;
                    }
                }
                if ((t[i] == 1 && si.equals("x")) || (t[i] == 2 && si.equals("o"))) {
                    if (t[next] == 0) {
                        t[next] = (t[prev] == 1) ? 2 : 1;
                    } else  {
                        isMenagerie = (t[next] == t[prev]) ? true : false;
                    } 
                }
            }
            if (isMenagerie) {
                for (int i = 0; i < t.length; i++) {
                t[i] = 0;
            }
                t[0] = 2;
                if (s.substring(0, 1).equals("x")) {
                t[N-1] = t[1] = 1;
            } else {
                t[N-1] = 1;
                t[1] = 2;
            }
                for (int i = 1; i < s.length(); i++) {
                String si = s.substring(i, i+1);
                int next = i + 1;
                int prev = i - 1;
                if (i == 0) {
                    prev = N - 1;
                }
                if (i == N - 1) {
                    next = 0;
                }
                if ((t[i] == 1 && si.equals("o")) || (t[i] == 2 && si.equals("x"))) {
                    if (t[next] == 0) {
                        t[next] = t[prev];
                    } else {
                        isMenagerie = (t[next] != t[prev]) ? true : false;
                    }
                }
                if ((t[i] == 1 && si.equals("x")) || (t[i] == 2 && si.equals("o"))) {
                    if (t[next] == 0) {
                        t[next] = (t[prev] == 1) ? 2 : 1;
                    } else {
                        isMenagerie = (t[next] == t[prev]) ? true : false;
                    }
                }
            }
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