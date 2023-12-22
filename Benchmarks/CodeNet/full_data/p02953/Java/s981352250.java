import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	scanner.nextLine();
      	int[] wall = new int[n];
      	for(int i = 0 ; i < n ; i++ ) {
          wall[i] = scanner.nextInt();
        }

      	int currentHeight = wall[n-1];
      	for(int i = 1 ; i < n ; i++ ) {
          if ( wall[n - i - 1] <= currentHeight ) {
            currentHeight = wall[n - i - 1];
          }
          else if ( wall[n - i - 1] + 1 == currentHeight ) {
          }
          else {
            System.out.println("No");
            return;
          }
        }
      	System.out.println("Yes");
	}
}