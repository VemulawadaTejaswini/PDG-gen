public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String cmp = "==";
        if (a < b)
            cmp = "<";
        else if (a > b)
            cmp = ">";
        System.out.printf("a %s b\n", cmp);
    }
}
