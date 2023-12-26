public class Main {
    public static void main(String...args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = sc.next();
            String b = sc.next();
            int ab = Integer.parseInt(a + b);
            int tmp = (int)Math.sqrt(ab);
            if (Math.pow(tmp, 2) == ab) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
