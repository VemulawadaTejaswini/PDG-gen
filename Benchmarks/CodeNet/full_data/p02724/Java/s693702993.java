import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int x=kbd.nextInt();
   int g=0;
   if(x<500){
     g=0;
   }else{
   g=x/500;
}
 int p=0;
if(x-500*g<5){
   p=0;
 }else{
  p=(x-500*g)/5;
}

   int a=0;
   a=1000*g+5*p;
   System.out.println(a);
}
}
