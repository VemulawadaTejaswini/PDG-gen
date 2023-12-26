public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String a = sc.next();
        String b = sc.next();
        boolean squareNumber = false;
        final int C = Integer.parseInt(a+b);
        for (int i = 1; i < C; i++) {
            if (i * i == C) squareNumber = true;
        }
        out.println(squareNumber ? "Yes" : "No");
        out.flush();
    }
}
