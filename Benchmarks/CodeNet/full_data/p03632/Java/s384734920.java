import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    sc.close();
    int time=0;

    if((a<=c)&&(b<=d)){
      time=b-c;
      if(time<0){
        time=0;
      }
    }else if(a>=c){
      time=b-a;
    }else if(b>=d){
      time=d-c;
    }

    System.out.println(time);
  }
}