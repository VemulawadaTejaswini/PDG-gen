public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        while (num != 0) {
            System.out.println("Case " + count + ": " + num);
            num = sc.nextInt();
            count++;
        }
    }
}
