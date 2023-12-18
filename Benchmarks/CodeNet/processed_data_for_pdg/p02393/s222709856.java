class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = 0;
        if(a > b){
            d = a;
            a = b;
            b = d;
        }
        if(b > c){
            d = b;
            b = c;
            c = d;
        }
        if(a > b){
            d = b;
            b = a;
            a = d;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
