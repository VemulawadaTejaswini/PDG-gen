import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
        
    if(a==0 && b==0){
      System.out.println(0);
      return;
    }
    
    int o = a * n/(a+b);
    int nokori = n % (a+b);
    
    if(nokori >=a)
      o += a;
    else
      o += nokori;
      
    System.out.println(o);
  }
}