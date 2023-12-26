class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a=new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int k = Integer.parseInt(scanner.next());
        scanner.close();
        String message;
        if (Math.abs(a[0] - a[4]) <= k) {
            message="Yay!";
        } else {
            message=":(";
        }
        System.out.println(message);
        System.out.flush();
    }
}
