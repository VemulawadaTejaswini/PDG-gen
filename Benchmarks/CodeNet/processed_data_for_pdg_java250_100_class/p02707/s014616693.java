public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ans = new int[N];
        Arrays.fill(ans, 0);
        for (String An: br.readLine().split(" ")) {
            ans[Integer.valueOf(An) - 1]++;
        }
        for (int i: ans) {
            System.out.println(i);
        }
    }
}
