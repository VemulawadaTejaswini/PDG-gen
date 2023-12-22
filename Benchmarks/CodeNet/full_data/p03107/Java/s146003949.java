import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int red = 0;
    int blue = 0;
    int n = s.length();
    for(int i = 0; i < n; i++){
      if(s.charAt(i) == '0'){
        red++;
      }else{
        blue++;
      }
    }
    System.out.println(Math.min(red, blue) * 2);
  }
}
