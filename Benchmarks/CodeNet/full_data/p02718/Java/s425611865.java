import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] As = new int[N];
    int total = 0;
    int count = 0;
    for (int i = 0; i < As.length; i++) {
    	As[i] = sc.nextInt();
    	total += As[i];
    }
    for (int i : As) {
    	if((total/(4 * M)) < i) {
    		count++;
    	}
    }
    if (M <= count) System.out.println("Yes");
    else System.out.println("No");
  }
}