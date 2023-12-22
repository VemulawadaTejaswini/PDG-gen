import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int l = Integer.parseInt(sc.next());

    if(l<0 && n+l-1<0){
      System.out.println((2*l+n-2)*(n-1)/2);
    }else if(l>0){
      System.out.println((2*l+n)*(n-1)/2);
    }else{
      System.out.println((2*l+n-1)*n/2);
    }

  }
}