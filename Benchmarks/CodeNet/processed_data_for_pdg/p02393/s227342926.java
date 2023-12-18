class Main{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b){
            int x=b;
            b=a;
            a=x;
        }
        if(b>c){
            int y=c;
            c=b;
            b=y;
        }
        if(a>b){
            int z=b;
            b=a;
            a=z;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
