import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int i=(int)Math.sqrt(m);i>0;i--){
      if(m%i==0&&m/i>=n){
        System.out.println(i);
        return;
      }
    }
  }
}