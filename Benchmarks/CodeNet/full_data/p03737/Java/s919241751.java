import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String[] s=sc.next().split(" ");
    for(int i=0;i<3;i++){
      char c=s[i].charAt(0);
      System.out.print(String.valueOf(c).toUpperCase());
    }
    System.out.println("");
  }
}