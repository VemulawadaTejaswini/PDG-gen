public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0")) {
            int count = 0;
            for (char c : input.toCharArray()) {
                count += (c - '0');
            }
            bw.append(count + "\n");
        }
        bw.flush();
    }
}
