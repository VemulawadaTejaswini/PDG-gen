import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long x=sc.nextLong();
    long y=sc.nextLong();
    for(int i=0;true;i++){
      if(x>y){
        System.out.println(i);
        return;
      }
      y/=2;
    }
  }
}