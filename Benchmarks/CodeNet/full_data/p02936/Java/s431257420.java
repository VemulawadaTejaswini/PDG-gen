
import java.io.*;
import java.util.*;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int n = in.nextInt();
        int q = in.nextInt();

        int input[][] = new int[n-1][2];
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<n-1;i++){
            input[i][0] = in.nextInt();
            input[i][1] = in.nextInt();
            set.add(input[i][0]);
            set.add(input[i][1]);
        }

        //de(input);

        int result[][] = new int[set.size()][2];
        int _i = 0;
        for(int temp :set){
            result[_i][0] = temp;
            //result[_i][1] = 0;
            _i++;
        }


        int counter = 0;
        for(int i=0;i<q;i++){
            int no = in.nextInt();
            int score = in.nextInt();

            boolean flg = false;
            for(int j=0;j<set.size();j++){
                if(result[j][0] == no) {
                    result[j][1] += score;
                    counter++;
                    flg = true;
                    break;
                }
            }
            if(!flg){
                result[counter][0] = no;
                result[counter][1] = score;
                counter++;
            }
        }

        //Arrays.sort(input,(a,b)-> Integer.compare(a[0],b[0]));

        for(Integer no :set){
            int tempScore = 0;
            for(int i=0;i<result.length;i++){
                if(result[i][0] == no){
                    tempScore = result[i][1];
                    break;
                }
            }
            for(int i=0;i<input.length;i++){
                if(input[i][0] == no){
                    int resultno = input[i][1];
                    for(int j=0;j<result.length;j++){
                        if(result[j][0] == resultno){
                            result[j][1] += tempScore;
                            break;
                        }
                    }
                }
            }

        }

        //de(result);
        Arrays.sort(result,(a,b)-> Integer.compare(a[0],b[0]));

        ans(out,result);
        out.close();


    }

    public static void de(int[][] input){
        for(int i=0; i<input.length;i++){
            d(input[i][0] + ":" + input[i][1]);
        }
    }
    public static void ans(PrintWriter out , int[][] input){
        for(int i=0; i<input.length;i++){
            out.print(input[i][1] + " ");
        }
    }

    public static void d(String message){
        System.out.println(message);
    }

    static class InputReader {

        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer;
        private int bytesRead;

        public InputReader(InputStream is) {
            din = new DataInputStream(is);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public InputReader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() {
            try {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            } catch (IOException e) {
                throw new RuntimeException("trying to read from null input, verify constraints ");
            }
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

    }
}
