class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int i = 1;
        while(true){
            x = sc.nextInt();
            if(x == 0){
                break;
            }
            System.out.println("Case " + (i++) + ": " + x);
        }
    }
}
