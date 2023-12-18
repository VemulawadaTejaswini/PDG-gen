public class Main{
   public static void main(String[] a){
      Scanner scn = new Scanner(System.in);
      int d = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      int z;
if(b>c){
z=b;
b=c;
c=z;
}
if(c>d){
z=c;
c=d;
d=z;
}if(b>c){
z=b;
b=c;
c=z;
}
System.out.println(b+" "+c+" "+d);
}
}
