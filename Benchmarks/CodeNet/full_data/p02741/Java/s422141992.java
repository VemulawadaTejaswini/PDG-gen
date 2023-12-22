import java.util.*;
class Main{
  public static void main(String args[]){
    long a,b,c;
    Scanner s = new Scanner(System.in);
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    if(c-a-b<=0){
      System.out.println("No"); 
    }else{
      if(4*a*b<(c-a-b)*(c-a-b)){
        System.out.println("Yes"); 
      }else{
        System.out.println("No"); 
      }
    }
  }
}