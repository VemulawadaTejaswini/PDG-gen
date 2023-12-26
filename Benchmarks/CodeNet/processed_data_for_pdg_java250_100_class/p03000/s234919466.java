public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {
            Scanner sc = new Scanner(in);
            int n = sc.nextInt();
            int x = sc.nextInt();
            int bs = 1;
            int d = 0;
            for (int i = 0; i < n; i++) {
                d += sc.nextInt();
                if (d <= x) bs++;
            }
            out.println(bs);
        }
    }
}
