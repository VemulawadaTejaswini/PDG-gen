class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int tmp;
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(b<a){
            tmp=b;
            b=a;
            a=tmp;
        }
        int c=scan.nextInt();
        if(c<a){
            tmp=c;
            c=b;
            b=a;
            a=tmp;
        }else if(c<b){
            tmp=c;
            c=b;
            b=tmp;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
