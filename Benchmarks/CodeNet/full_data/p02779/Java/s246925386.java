import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read1 = null;
        String read2 = null;
        try {
            read1 = br.readLine();
            read2 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int n = Integer.parseInt(read1);
        String[] an = read2.split(" ", 0);
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (an[i].equals(an[j])) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}