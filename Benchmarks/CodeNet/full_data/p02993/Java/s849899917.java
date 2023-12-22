import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] chars = sc.next().toCharArray();
    String status = "Good";
    for(int i=1; i<chars.length; i++){
      if(chars[i-1]==chars[i]){
        status = "Bad";
      }
    }
    System.out.println(status);
  }
}