public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = 1;
        String input;
        while (!(input = br.readLine()).equals("0")) {
            bw.append("Case " + (c++) + ": " + input + "\n");
        }
        bw.flush();
    }
}
