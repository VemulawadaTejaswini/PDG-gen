class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int c = (h + (a - 1)) / a;
        System.out.println(c);
    }
}
