public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int a, b;
        str = scanner.next();
        a = Integer.parseInt(str);
        str = scanner.next();
        b = Integer.parseInt(str);
        scanner.close();
        System.out.println(a*b+" "+(2*a+2*b));
    }
}
