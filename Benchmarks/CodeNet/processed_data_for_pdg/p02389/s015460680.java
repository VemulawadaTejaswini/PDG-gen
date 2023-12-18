class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.print(x * y );
            System.out.println(" " + (2 * x + 2 * y));
        }
    }
}
