class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, input;
        i = 0;
        while (true) {
            i++;
            input = sc.nextInt();
            if (input==0) break;
            System.out.println("Case "+i+": "+input);
        }
    }
}
