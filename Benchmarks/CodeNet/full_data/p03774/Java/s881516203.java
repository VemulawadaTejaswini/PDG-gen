import java.io.*;
import java.util.*;

public class Main {
    public static PrintWriter out;
    public static FastScanner in;

    private class Student{
        int x;
        int y;
        int d;
        int idx;
        public Student(int x, int y, int d, int idx) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.idx = idx;
        }


    }

    private void solve(){
        int n = in.nextInt();
        int m = in.nextInt();

        List<Student> lst = new ArrayList<>();

        for(int i=0;i<n;i++){
            lst.add(new Student(in.nextInt(),in.nextInt(),Integer.MAX_VALUE,-1));
        }

        for(int i=0;i<m;i++){
            int x = in.nextInt();
            int y = in.nextInt();

            for(Student s:lst){
                int v = Math.abs(s.x-x)+Math.abs(s.y-y);
                if(v < s.d){
                    s.idx = i;
                    s.d = v;
                }
            }
        }

        for(Student s:lst){
            out.println(s.idx+1);
        }
    }

    private void runIO() {
        in = new FastScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        solve();
        out.close();
    }
    private static class FastScanner {
        BufferedReader bufferedReader;
        StringTokenizer stringTokenizer;

        private FastScanner() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        private String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private String nextLine() {
            String ret = "";
            try {
                ret = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
