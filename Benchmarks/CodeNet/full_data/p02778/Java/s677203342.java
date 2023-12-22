import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String S = sc.next();
	StringBuilder X = new StringBuilder();
    for(int i =0; i<S.length(); i++){
    	X.append("x");
    }
    System.out.println(X.toString());

  }
}
