import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sums =0;
    String S = String.valueOf(N);
    for(int i=0;i<S.length();i++){
      sums = sums+Integer.parseInt(S.substring(i,i+1));
    }
    if(N%sums==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  

  
}