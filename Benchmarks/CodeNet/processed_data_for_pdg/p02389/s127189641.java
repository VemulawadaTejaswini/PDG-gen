class Main {
    static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("%d %d\n", a*b, a*2+b*2);
    }
}
