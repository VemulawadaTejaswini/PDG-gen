public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a_b = sc.nextLine().split(" ");
        int a = Integer.parseInt(a_b[0]);
        int b = Integer.parseInt(a_b[1]);
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
    }
}
