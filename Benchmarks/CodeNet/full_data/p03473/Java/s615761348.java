import java.io.*;

class NewYear {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.valueOf(in.readLine()).intValue();
        System.out.println(48-M);
    }
}