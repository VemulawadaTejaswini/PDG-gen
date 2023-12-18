class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int a;
        while(true){
            a = sc.nextInt();
            if(a == 0){
                break;
            }
            System.out.println("Case " + num + ": " + a);
            num++;
        }
    }
}
