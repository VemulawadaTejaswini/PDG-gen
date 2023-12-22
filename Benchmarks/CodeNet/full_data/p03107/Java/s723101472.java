import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int length;
    int count = 0;
    do{
      length = str.length();
      str = str.replace("01","").replace("10","");
      count += length - str.length();
    }while(length != str.length());
    System.out.println(count);
  }
}