class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b > c){
            int tmp = b;
            b = c;
            c = tmp;
        }
        if (a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
