import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String in=scan.next();
    String input[]=in.split("");
    boolean flag=true;
    if(input[2].equals(input[3]) && input[4].equals(input[5])){
      flag=false;
    }
    if(flag){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}