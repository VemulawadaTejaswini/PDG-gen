import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String o=sc.nextLine();
    String e=sc.nextLine();
    sc.close();
    for(int i=0;i<o.length();i++){
      System.out.print(o.substring(i,i+1)+e.substring(i,i+1));
    }
      System.out.println();
  }
}