import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
  public static void main(String[] args){
    String[] input=(new Scanner(System.in)).nextLine().split(" ");
    String[] evenArray=new String[]{"0","2","4","6","8"};
    boolean result=Arrays.asList(evenArray).contains(input[0].substring(input[0].length()-1));
    result=result||Arrays.asList(evenArray).contains(input[1].substring(input[1].length()-1));
    String output=result?"Even":"Odd";
    System.out.println(output);
  }
}