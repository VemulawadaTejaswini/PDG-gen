public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        boolean judge = t.matches(s + ".");
        String result = judge ? "Yes" : "No";
        System.out.println(result);
    }
}
