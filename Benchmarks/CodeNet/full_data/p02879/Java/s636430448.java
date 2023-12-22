import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if((a<1)||(9<a)){
      System.out.println(-1);
      return;
    }else if(b<1||9<b){
      System.out.println(-1);
      return;
    }
    
    System.out.println(a*b);
  }
}