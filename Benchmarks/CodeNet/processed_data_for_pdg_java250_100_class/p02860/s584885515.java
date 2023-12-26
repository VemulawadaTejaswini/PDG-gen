public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        boolean judge = false;
        if (n % 2 == 0) {
            String head = s.substring(0, s.length() / 2);
            String foot = s.substring(s.length() / 2, s.length());
            judge = head.equals(foot);
        }
        String result = judge ? "Yes" : "No";
        System.out.println(result);
        sc.close();
    }
}
