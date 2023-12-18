public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 < num2) {
            System.out.println("a < b");
        } else if (num1 > num2) {
            System.out.println("a > b");
        } else {
            System.out.println("a == b");
        }
    }
}
