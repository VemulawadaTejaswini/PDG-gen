public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String s = scanner.next();
            String s2 = s + s;
            String p = scanner.next();
            if (s2.contains(p)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } catch (Exception e) {
        } finally {
        }
    }
}
