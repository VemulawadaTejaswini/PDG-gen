public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int digit = (int)(Math.log(n) / Math.log(k)) + 1;
        System.out.println(digit);
    }
}
