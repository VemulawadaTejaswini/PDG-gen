public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        boolean judge = s.matches("[a-z]");
        String result = judge ? "a" : "A";
        System.out.println(result);
    }
}
