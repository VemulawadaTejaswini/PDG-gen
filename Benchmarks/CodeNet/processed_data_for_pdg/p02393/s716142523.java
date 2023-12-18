class Main{
 public static void main(String[] args){
 Scanner stdIn = new Scanner(System.in);
   int a = stdIn.nextInt();
   int b = stdIn.nextInt();
   int c = stdIn.nextInt();
   int i;
   if (a < b){
   } else {
   i=a;
   a=b;
   b=i;
   }
   if (b > c){
   i=b;
   b=c;
   c=i;
     if (a > b){
     i=a;
     a=b;
    b=i;
     }
   }
   System.out.println(a+ " " + b + " "+ c);
 }
}
