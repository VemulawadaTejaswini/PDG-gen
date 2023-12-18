class Main{
     public static void main(String[] args){
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();
        int b = as.nextInt();
        int c = as.nextInt();
        int tr;
        if(a>b){
          tr=a;
          a=b;
          b=tr;
         }
        if(b>c){
          tr=b;
          b=c;
          c=tr;
               }
        if(a>b){
          tr=a;
          a=b;
          b=tr;
        }  
                  System.out.println(a+" "+b+" "+c);
   }
}
