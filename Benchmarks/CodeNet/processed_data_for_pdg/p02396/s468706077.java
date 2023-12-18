public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int count = 1;
        while (x != 0) {
            System.out.println("Case " + count + ": " + x);
            x = input.nextInt();
            count++;
        }
    }
}
