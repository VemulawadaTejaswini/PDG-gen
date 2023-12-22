import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
    int k=a; a=b;b=k;
    k=a;a=c;c=k;
    pl(a+" "+b+" "+c);
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
