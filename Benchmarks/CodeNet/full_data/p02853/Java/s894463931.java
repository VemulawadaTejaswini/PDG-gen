import java.io.*;

public class Main {
    public static void main(String[] args) {
        int a, b;

        try (InputScanner is = new InputScanner(System.in)) {
            a = is.ni();
            b = is.ni();
        }
        int result = 0;
        result += prime(a);
        result += prime(b);
        if (a ==1 && b ==1){
            result += 400000;
        }

        System.out.println(result);
    }

    private static int prime(int n){
        if ( n ==3){
            return 100000;
        }
        if ( n ==2){
            return 200000;
        }
        if ( n ==1){
            return 300000;
        }
        return 0;
    }
    //-------------------------------------------------------------------
    public static class InputScanner implements Closeable {
        private final BufferedReader br;
        private String[] element;
        private int elementIndex;

        public InputScanner(InputStream is) {
            this.br = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            return this.nextElement();
        }

        //next int
        public int ni() {
            return Integer.parseInt(this.nextElement());
        }

        //next long
        public long li() {
            return Long.parseLong(this.nextElement());
        }

        //next int array
        public int[] nia(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.ni();
            }
            return arr;
        }

        private void readLine() {
            try {
                this.element = this.br.readLine().split("\\s");
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.elementIndex = 0;
        }

        private String nextElement() {
            if (!hasElement()) {
                this.readLine();
            }
            return this.element[this.elementIndex++];
        }

        private boolean hasElement() {
            return this.element != null && this.element.length > this.elementIndex;
        }

        @Override
        public void close() {
            if (this.br != null) {
                try {
                    this.br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//-------------------------------------------------------------------
}
