import java.util.*;
class Main{
  public static void main(String[] arg){
    Scanner stdIn=new Scanner(System.in);
    int a=stdIn.nextInt();
    int b=stdIn.nextInt();
    int c=stdIn.nextInt();
    int count=3;
    if(a==b){
      count--;
      if(a==c){
        count=0;
      }
    }
    if(a==c){
      count--;
      if(a==b){
        count=0;
      }
    }
    System.out.println(count);
  }
}