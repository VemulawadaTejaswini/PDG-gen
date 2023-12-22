import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int b = A.length();
    if(b >= 3 && b <= 99 && b % 2 != 0){
    int c = (A.length()-1)/2;
    String B = A.substring(0,c);
    int d = (A.length() + 3)/2;
    String C = A.substring(d-1,A.length());
    //System.out.println(B+" "+C);
    int e = 0;
    for(int a = 0; a < B.length();a++){
      char D = B.charAt(a);
      char E = B.charAt(B.length()-1-a);
      if(D != E){
        e = 1;
      }
    }
    for(int a = 0; a < C.length();a++){
      char D = C.charAt(a);
      char E = C.charAt(C.length()-1-a);
      if(D != E){
        e = 1;
      }
    }
    if(e == 0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
  }}