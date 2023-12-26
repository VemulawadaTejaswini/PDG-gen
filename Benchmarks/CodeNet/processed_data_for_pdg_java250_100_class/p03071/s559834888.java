class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = Math.max(2 * A - 1, Math.max(A + B, 2 * B - 1));
        scanner.close();
        System.out.println(X);
        System.out.flush();
    }
}
