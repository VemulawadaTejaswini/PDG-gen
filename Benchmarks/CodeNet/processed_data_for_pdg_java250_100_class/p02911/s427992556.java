class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long K = Long.parseLong(sc.next());
        int Q = Integer.parseInt(sc.next());
        Long A[] = new Long[N];
        for (int i=0; i<N; i++) {
            A[i] = 0L;
        }
        for (int i=0; i<Q; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            A[a]++;
        }
        sc.close();
        PrintWriter out = new PrintWriter(System.out);
        for (int i=0; i<N; i++) {
            if (K + A[i] > Q) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }
        out.flush();
    }
}
