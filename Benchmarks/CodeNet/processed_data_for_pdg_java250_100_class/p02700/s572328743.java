class Main {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        final int b = scan.nextInt();
        int c = scan.nextInt(); 
        final int d = scan.nextInt();
        scan. close();
        while(true){
            c -= b;
            if(c <= 0){
                System.out.print("Yes"); 
                break;
            }
            a -= d;
            if(a <= 0){
                System.out.println("No");
                break;
            }
        }
    }
}
