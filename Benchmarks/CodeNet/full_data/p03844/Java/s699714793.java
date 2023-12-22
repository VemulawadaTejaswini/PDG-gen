import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  
  int num1=sc.nextInt();
  String op=sc.next();
  int num2=sc.nextInt();
  
  if(op.equals("+")){
    System.out.println(num1+num2);
  }else if(op.equals("-")){
    System.out.println(num1-num2);
  }
 }
}