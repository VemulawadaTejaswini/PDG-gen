import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String Sk[] = S.split("");
    Arrays.sort(Sk);
	
	int i=0;
	String A = Sk[0];
	String B = Sk[1];
	int cnt = 0;
	
	while(i<S.length()-1){
	  if(A.equals(B)){
	      B = Sk[i+1] + Sk[i+2];
	      i++;
	  }else{
	    B = Sk[i+1];
	  }
	  cnt++;
	  i++;
	}
	
	cnt++;
    System.out.println(cnt);
  }
}