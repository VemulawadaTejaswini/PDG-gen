public class Main{
  public static void main(String[] args){
    int a=13,b=3;
    int c=a+b,d=a-b,e=a*b;
    if(c<d) c=d;
    if(c<e) c=e;
    System.out.print(c);
  }
}