import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int ans; 
    Scanner sc = new Scanner(System.in);
    String s = sc.nextln();
    if(s[0]=='1') {ans++;}
    if(s[1]=='1') {ans++;}
    if(s[2]=='1') {ans++;}
    System.out.println(ans);
  }
}
