public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        final int N = Integer.parseInt(sc.next());
        String s = sc.next();
        String t = s.substring(0,N/2);
        t += t;
        out.println(s.equals(t) ? "Yes" : "No");
        out.flush();
    }
}
