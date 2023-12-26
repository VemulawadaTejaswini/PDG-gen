public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        final int N = Integer.parseInt(sc.next());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        out.println(set.size() == N ? "YES" : "NO");
        out.flush();
    }
}
