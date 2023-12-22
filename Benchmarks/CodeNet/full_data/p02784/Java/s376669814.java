import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read1 = null;
        String read2 = null;
        try {
            read1 = br.readLine();
            read2 = br.readLine();
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        String str[] = read1.split(" ", 0);
        String at[] = read2.split(" ", 0);
        int h = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        for (int i = 0; i < n; i++) {
            h = h - Integer.parseInt(at[i]);
        }
        if (h <= 0) {
            pw.println("Yes");
        }else {
            pw.println("No");
        }
        pw.flush();
    }
}