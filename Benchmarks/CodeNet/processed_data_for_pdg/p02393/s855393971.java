public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] st = br.readLine().split(" ");
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = Integer.parseInt(st[i]);
            for (int j = i; j >= 1; j--) {
                if (n[j - 1] > n[j]) {
                    int tmp = n[j];
                    n[j] = n[j - 1];
                    n[j - 1] = tmp;
                }
            }
        }
        bw.append(n[0] + " " + n[1] + " " + n[2] + "\n");
        bw.flush();
    }
}
