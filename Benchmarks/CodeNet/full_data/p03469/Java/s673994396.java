import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    sc = sc.next();
    if(sb.charAt(4).equals(7) == 0) 
      sb.setCharAt(4, "8");
    System.out.println(sb);   
  }
}