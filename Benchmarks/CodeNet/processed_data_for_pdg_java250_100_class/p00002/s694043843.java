class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit[] = new int[200];
        int i = 0;
        for(; sc.hasNextInt(); i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sub = a+b;
            digit[i] = String.valueOf(sub).length();
        }
        for(int j=0; j<i; j++) {
            System.out.println(digit[j]);
        }
    }
}
