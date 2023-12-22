import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    String s1 = sc.next();
    String s2 = sc.next();
    String s3 = sc.next();
    
    int ans =0;
    if(s1 == "1") {ans++;}
    if(s2 == "1") {ans++;}
    if(s3 == "1") {ans++;}
    
    System.out.println(ans);
  }
}
    
