import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String A=sc.next();
    String B=sc.next();
    String C=sc.next();
    
    if(Character.isUpperCase(B.charAt(0))){
      System.out.println(A.substring(0,1)+B.substring(0,1)+C.substring(0,1));
    }
  }
}