class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int cir = 2*(a+b);
        int area = a*b;
        System.out.println(area+ " " +cir);
    }
}
