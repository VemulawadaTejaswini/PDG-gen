import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt(); //モンスターの数
    int[] H = new int[N+1];
    String result = "YES";

    for(int i=1; i<=N; i++) {
    	H[i] = scan.nextInt();
    }

    Arrays.sort(H);

    for(int i =1; i<N; i++) {
    	if(H[i]==H[i+1]) {
    		result = "NO";
    	}
    }
    System.out.println(result);
  }
}
