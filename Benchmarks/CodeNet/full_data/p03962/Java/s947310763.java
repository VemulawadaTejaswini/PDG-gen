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
    }
    if(a==c){
      count--;
    }
    if(b==c){
      count--;
    }
    System.out.println(count);
  }
}