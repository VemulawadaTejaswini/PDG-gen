public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[q];
        int[] score = new int[n];
        for (int i = 0; i < q; i++) {
            a[i] = Integer.parseInt(sc.next());
            score[a[i] - 1]++;
        }
        String[] result = new String[n];
        int sum = Arrays.stream(score).sum();
        for (int i = 0; i < n; i++) {
            result[i] = k <= sum - score[i] ? "No" : "Yes";
        }
        System.out.println(String.join("\r\n", result));
        sc.close();
    }
}
