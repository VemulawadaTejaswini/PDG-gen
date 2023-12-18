class Main{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int a,b,c,x,y,z;
     a = scanner.nextInt();
     b = scanner.nextInt();
     c = scanner.nextInt();
     y = 0;
     if(a>b){
       x = a;
     }else x = b;
     if(x<c)x = c;
     if(a<b){
       z = a;
     }else z =b;
     if(z>c)z = c;
     if(a!=x&&a!=z)y = a;
     if(b!=x&&b!=z)y = b;
     if(c!=x&&c!=z)y = c;
     if(a==b||a==c||b==c){
       if((a==b&&a==x)||(a==c&&a==x)||(b==c&&b==x)){
         y = x;
       }else y = z;
     }
     System.out.println(z +" "+ y +" "+ x);
  }
}
