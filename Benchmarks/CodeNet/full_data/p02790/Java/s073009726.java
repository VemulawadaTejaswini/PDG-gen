import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    String a = "";
    String b = "";
 
    for (int i=0;i<m;i++){
      a += n+"";
    }
 
    for (int j=0;j<n;j++){
      b += m+"";
    }
 
    if (n>=m){
      System.out.println(b);
    }
    else{
      System.out.println(a);
    }
  }
}