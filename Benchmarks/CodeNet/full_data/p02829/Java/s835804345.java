import java.util.*;

public class Main{
  
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	  int[] ans = {1,2,3};
	  int wAns1 = scanner.nextInt();
	  int wAns2 = scanner.nextInt();
	  scanner.close();
	  for (int i : ans) {
		if (i != wAns1 && i != wAns2) {
			System.out.println(i);
		}
	}
  }
}