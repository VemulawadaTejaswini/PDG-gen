import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int multiply= a*b;
    String result = "";
    if(multiply%2==0){
      result="even";
    }else{
      result= "odd";
    }
   System.out.println(result); 
  }
}