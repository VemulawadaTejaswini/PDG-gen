import java.util.Scanner;
public class Main{
  public static void main(String args[]){
 Scanner enter = new Scanner(System.in);
  int n = enter.nextInt();
  String s = String.valueOf(n);
  
  if(s.charAt(0) !=7 || s.charAt(1) !=7 || s.charAt(2) != 7){
    System.out.println("No");
  }
  else{
    System.out.println("Yes");
  }
  }
}