import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int x = s.nextInt();
    int y = s.nextInt();
    
    if(n>0 && x>y){
      System.out.println("1");
    }
    else if(n>0 && y>x){
       System.out.println("2");
    }
  }
}