import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] b = a.toCharArray();
    String c = "Yes";
    for(i = 0;i < b.length;i++){
      if(i % 2 == 0 && char[i] != 'L' || char[i] != 'U' ||  char[i] != 'D' ){
        c = "No"; 
      }else if(i % 2 == 1 && char[i] != 'R' || char[i] != 'U' ||  char[i] != 'D' ){
        c = "No"; 
    }
      System.out.println(c);
  }
}