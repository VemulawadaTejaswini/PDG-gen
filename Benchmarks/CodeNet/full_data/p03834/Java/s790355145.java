import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    String s=sc.next();
    String s2=s.replace(","," ");
    System.out.println(s2);
  }
}