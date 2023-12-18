class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        try{
            System.out.printf("%d\n", x * x * x);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
