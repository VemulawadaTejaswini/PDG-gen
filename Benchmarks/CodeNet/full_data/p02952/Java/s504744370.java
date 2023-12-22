class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= a; i++) {
            if (String.valueOf(i).length() % 2 == 1) total++;
        }
        System.out.println(total);
    }
}