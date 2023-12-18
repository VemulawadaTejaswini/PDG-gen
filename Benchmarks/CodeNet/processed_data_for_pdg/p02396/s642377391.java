class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int i = 1;
        while(true){
            a = sc.nextInt();
            if(a == 0){
                break;
            }else{
                System.out.println("Case " + i +": " + a);
                i = i + 1;
            }
        }
    }
}
