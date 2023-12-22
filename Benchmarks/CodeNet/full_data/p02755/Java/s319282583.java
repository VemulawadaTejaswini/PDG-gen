import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    byte a = sc.nextByte();
    byte b = sc.nextByte();
    double c = a/0.08;
    double d = (a+1)/0.08;
    double e = b/0.1;
    double f = (b+1)/0.1;
    double max = Math.max(c,e);
    double min = Math.min(d,f);
    if(c >= f || e >= d){
      System.out.println(-1);
    }else if(Math.ceil(max)<min){
      System.out.println((int)Math.ceil(max));
    }else{
      System.out.println(-1);
    }
  }
}