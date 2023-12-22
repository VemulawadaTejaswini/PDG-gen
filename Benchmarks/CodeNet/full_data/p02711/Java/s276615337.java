import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String N =sc.next();
    String n[] =N.split("",0);
    for(int i=0;i<N.length();i++){
      if(n[i].equals("7")){System.out.println("Yes");System.exit(0);}
    }
    System.out.println("No");
  }
}