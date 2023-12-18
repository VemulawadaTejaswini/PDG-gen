class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int s;
        int i = 1;
        do{
            s = stdIn.nextInt();
            if(s == 0) return;
            else{
                System.out.println("Case " +i+ ": " +s);
                i++;
            }
        }while(s!=0);
    }
}
