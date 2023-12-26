public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        final int H = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        out.println(H%A == 0 ? H/A : H/A +1);
        out.flush();
    }
}
