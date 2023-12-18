class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        int i = 0;
        while(true){
            i++;
            int t = scan.nextInt();
            if(t == 0){
                break;
            }
            System.out.println("Case "+ i +": "+ t);
        }
    }
}
