import java.util*;

public class Main {
	public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int maxSum=0;
      for(int i=0; i<num; i++){
        maxSum+=scan.nextInt();
      }
      maxSum=maxSum-1;
      System.out.println(maxSum);
    }
}