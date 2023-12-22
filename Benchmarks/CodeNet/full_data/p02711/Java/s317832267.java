import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int len = a.length();
    char[] b = a.toCharArray();
    boolean ans = false; 
    for(int i = 0;i < len;i++){
      if(b[i] == '7'){
        ans = true;
      }
    }
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");      
    }
  }
}