public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp[] = br.readLine().split(" ");
        int N = Integer.valueOf(tmp[0]);
        int M = Integer.valueOf(tmp[1]);
        int sum = 0;
        for (String A: br.readLine().split(" ")) {
            sum += Integer.valueOf(A);
        }
        if (N - sum >= 0) {
            System.out.println(N - sum);
        } else {
            System.out.println("-1");
        }
    }
}
