class Main{
    public static void main(String[] args){
        int ans = 1;
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 0;i < 3;i++){
        ans = ans * x;
        }
    System.out.println(ans);
    }
}
