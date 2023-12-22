import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String o=sc.nextLine();
    String e=sc.nextLine();
    sc.close();
    if(o.length()==e.length()){
      for(int i=0;i<o.length();i++){
        System.out.print(o.substring(i,i+1)+e.substring(i,i+1));
      }
    }else{
      for(int i=0;i<o.length()-1;i++){
        System.out.print(o.substring(i,i+1)+e.substring(i,i+1));
      }
      System.out.print(o.substring(o.length()-1,o.length()));
    }
    System.out.println();
  }
}