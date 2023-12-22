import java.util.*;

class Main
{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int ans=(int)Math.ceil(Math.log(n)/Math.log(k));
    System.out.print(ans);
  }
}