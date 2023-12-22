import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int L =sc.nextInt();
    L=L+sc.nextInt();
    int R =sc.nextInt();
    R=R+sc.nextInt();
    String q ="";
    if(L<R){
      q="Right";
    }else if(L==R){
      q="Balanced";
    }else{
      q="Left";
    }
    System.out.println(q);
  }
  

  
}