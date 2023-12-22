import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[][] cij = new int[3][];

        try (InputScanner is = new InputScanner(System.in)) {
            cij[0] = is.nia(3);
            cij[1] = is.nia(3);
            cij[2] = is.nia(3);
        }
        boolean con1 = (cij[1][0] - cij[1][1]) == (cij[0][0] - cij[0][1]);
        boolean con2 = (cij[2][0] - cij[2][1]) == (cij[0][0] - cij[0][1]);
        boolean con3 = (cij[1][0] - cij[1][2]) == (cij[0][0] - cij[0][2]);
        boolean con4 = (cij[2][0] - cij[2][2]) == (cij[0][0] - cij[0][2]);

        boolean con5 = (cij[0][1] - cij[1][1]) == (cij[0][0] - cij[1][0]);
        boolean con6 = (cij[0][2] - cij[1][2]) == (cij[0][0] - cij[1][0]);

        boolean con7 = (cij[0][1] - cij[2][1]) == (cij[0][0] - cij[2][0]);
        boolean con8 = (cij[0][2] - cij[2][2]) == (cij[0][0] - cij[2][0]);

        if (con1 && con2 && con3 && con4 && con5 && con6 && con7 && con8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

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
