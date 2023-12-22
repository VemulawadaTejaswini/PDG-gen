import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();//青
    int b=sc.nextInt();//赤

    int total=a+b;

    int am=n%total;

    int ans;

    if (am>a) {
      ans=n/total*a+a;
    }else{
      ans=n/total*a+am;
    }

    System.out.println(ans);
  }
}
