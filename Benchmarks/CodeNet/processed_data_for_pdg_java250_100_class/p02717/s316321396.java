public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        {
            String tmp = a;
            a = b;
            b = tmp;
        }
        {
            String tmp = a;
            a = c;
            c = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
