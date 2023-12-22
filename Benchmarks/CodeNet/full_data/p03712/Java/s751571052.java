import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    String str[]=new String[h];
    for(int i=0;i<h;i++){
      str[i]=sc.next();
    }
    sc.close();
    for(int i=0;i<w+2;i++){
      System.out.print("#");
    }
    System.out.println("");
    for(int i=0;i<h;i++){
      System.out.println("#"+str[i]+"#");
    }
    for(int i=0;i<w+2;i++){
      System.out.print("#");
    }
    System.out.println("");
  }
}