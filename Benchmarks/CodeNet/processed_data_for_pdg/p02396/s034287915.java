class Main{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int b;
        int c=0;
        do{
            b = a.nextInt();
            c++;
            if(b!=0){
                System.out.println("Case "+c+": "+b);
            }
        }while(b!=0);
    }
}
