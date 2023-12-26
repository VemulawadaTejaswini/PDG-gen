public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(l);
        int max = Arrays.stream(l).max().getAsInt();
        int other = Arrays.stream(l).sum() - max;
        String result = max < other ? "Yes" : "No";
        System.out.println(result);
        sc.close();
    }
}
