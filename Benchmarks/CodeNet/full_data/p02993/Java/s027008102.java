import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String N = String.valueOf(n);
    char N1 = N.charAt(0);
    char N2 = N.charAt(1);
    char N3 = N.charAt(2);
    char N4 = N.charAt(3);
    if(N1==N2||N2==N3||N3==N4){
      System.out.println("Bad");
    }else{
      System.out.println("Good");
    }
    
    

 }
}