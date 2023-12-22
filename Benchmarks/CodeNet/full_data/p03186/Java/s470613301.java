import java.util.*;

class Main{
  public static void main(String args[]){
    int a,b,c;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    
    System.out.println(min(a+b+1,c)+b);
    
  }
}
    