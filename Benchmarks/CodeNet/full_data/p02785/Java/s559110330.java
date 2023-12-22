import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

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
        String str2[] = read2.split(" ", 0);
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int at = n - k;
        if (at > 0) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str2[i]);
            }
            Arrays.sort(a);
            long atc = 0;
            for (int i = 0; i < at; i++) {
                atc = atc + a[i];
            }
            pw.println(atc);
        }else {
            pw.println(0);
        }
        pw.flush();
    }
}