class Main{
    public static void main(String args[]){
         int a=Integer.parseInt(args[0]);
         int b=Integer.parseInt(args[1]);
         int c=Integer.parseInt(args[2]);
         int l,s;
         if(b>=c){
            l=b;
            s=c;
        }else{
            l=c;
            s=b;
        }
        System.out.println(s+"  "+s-(a-l));
}