import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    String S = sc.next();
    char[] C = S.toCharArray();

    for(char ch: C){
      if(ch == 'a') {
		  A--;
    	  if(A >= 0) System.out.println("Yes");
    	  else System.out.println("No");
      }
      else if(ch == 'b') {
    	  B--;
    	  if(B >= 0 && A+B>=0) System.out.println("Yes");
    	  else System.out.println("No");
      }
      else {
    	  System.out.println("No");
      }
    }
  }
}