public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int x1 = Integer.parseInt(s1);
        int x2 = Integer.parseInt(s2);
        System.out.printf("%d %d\n", x1 * x2, (x1 + x2) * 2);
    }
}
