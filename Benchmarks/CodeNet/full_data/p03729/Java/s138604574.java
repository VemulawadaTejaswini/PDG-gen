import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str3 = sc.nextLine();
    char a = str1.charAt(str1.length()-1);
    char b = str2.charAt(0);
    char c = str2.charAt(str2.length()-1);
    char d = str3.charAt(0);
    if(a==b&&c==d){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}