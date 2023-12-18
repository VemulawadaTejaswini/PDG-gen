class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp;
        if (b < a){
            temp = a;
            a = b;
            b = temp;
        }
        if (c < a){
            temp = a;
            a = c;
            c = temp;
        }
        if (c < b){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println (a + " " + b + " " + c);
    }
}
