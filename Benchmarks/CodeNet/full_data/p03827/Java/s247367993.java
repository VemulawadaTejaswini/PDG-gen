import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(reader.readLine()); // ignored

        char[] cs = reader.readLine().toCharArray();

        int result = 0;
        int max = result;
        for (int i = 0; i < cnt; i++) {
            if ('I' == cs[i])
                result++;
            else
                result--;
            if (result > max)
                max = result;
        }

        System.out.print(max);

//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
