import java.util.*;

public class Main{
  public static int func(int n){
    if(n*(n-1)==0){
      return 1;
    }else if(n>=2){
      func=n*func(n-2);
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    System.out.println(func(5));
  }
}