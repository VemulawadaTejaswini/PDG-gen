import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

  	
  	Scanner scan = new Scanner(System.in);
  	
  	String S = args[0];
  	String T = args[1];
  	int A = Integer.parseInt(args[2]);
  	int B = Integer.parseInt(args[3]);
  	String U = args[4];
  	
  	if(S == U){
      A --;
    } else if (T == U){
      B --;
    }
  
  	System.out.println(String.valueOf(A) + " " + String.valueOf(B));
  	
    }
}
  