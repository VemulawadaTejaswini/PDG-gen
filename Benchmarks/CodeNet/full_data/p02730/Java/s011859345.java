import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    
    int N = S.length();
    String S1 = S.substring(0,(N - 1) / 2);
    String S2 = S.substring((N + 3) / 2 - 1,N);
    
    String answer = "No";
    if(k(S,N) && k(S1,S1.length()) && k(S2,S2.length())){
      answer = "Yes";
    }
    
    System.out.println(answer);
  }
  
  public static boolean k(String str,int length){
    for(int i = 0;i < (length + 1) / 2;i++){
         /*System.out.println(
          i + "," + 
          str.charAt(i) + "," + str.charAt(length - i - 1));
      */
      if(str.charAt(i) != str.charAt(length - i - 1)){
        return false;
      }
    }
    return true;
  }
}