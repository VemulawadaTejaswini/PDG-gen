import java.io.*;

class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        String[] inputs = br.readLine().split(" ");
        int vacation = Integer.parseInt(inputs[0]);
        int works = Integer.parseInt(inputs[1]);

        int workDay = 0;
        inputs = br.readLine().split(" ");
        for(int i = 0; i < works; i++) {
            workDay += Integer.parseInt(inputs[i]);
        }

        int ans = vacation - workDay;
        ans = ans < 0 ? -1 : ans;

        pw.println(ans);
        pw.flush();
    }
}