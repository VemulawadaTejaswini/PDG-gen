import java.util.Scanner;
class Main{
    public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      int a=stdIn.nextInt();
      int b=stdIn.nextInt();
      int c=stdIn.nextInt();
      int t=0;
      t=a;
      a=b;
      b=t;
      int tem;
      tem=a;
      a=c;
      c=tem;
      System.out.println(a+" "+b+" "+c);
    }
}
