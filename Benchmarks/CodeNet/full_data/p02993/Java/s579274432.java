import java.util.*;
class Main {
  Scanner sc = new Scanner(System.in);
  static int pw = sc.next();

  public static String check(String pw) {
    for(int i=0; i < pw.length()-1; i++) {
      if (pw.substring(i, i+1).equals(pw.substring(i+1, i+2))){
        return "Bad";
      }
    }
    return "Good";
  }
  
  public static void main(String args[]){
	String result = check(pw);
    System.out.println(result);
  }
}