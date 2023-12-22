import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] z = br.readLine().split(" ");
            int n = Integer.parseInt(z[0]);
            int m = Integer.parseInt(z[1]);
            List<String> al = new ArrayList<>();
            List<String> bl = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                al.add(br.readLine());
            }
            for (int i = 0; i < m; i++) {
                bl.add(br.readLine());
            }
            boolean result = false;
            for (int i = 0; i < m; i++) {
                String a = al.get(i);
                String b = bl.get(i);
                if (a.contains(b)) {
                    result = true;
                }
            }
            System.out.println(result ? "yes" : "no");
        }
    }
}