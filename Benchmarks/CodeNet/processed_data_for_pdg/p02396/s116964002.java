class Main{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int i = 0;
        while(true){
            int num = scan.nextInt();
            i++;
            if(num == 0){
                break;
            }else{
                System.out.println("Case "+i+":"+" "+num);
            }
        }
    }
}
