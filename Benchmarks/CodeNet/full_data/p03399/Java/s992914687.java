import java.util.Scanner;
public class chocolate {
	public static void main(String[] args) {
	      Scanner scanner= new Scanner(System.in); 
	      int sum = 0;
	      int n = scanner.nextInt();
              int d = scanner.nextInt();
              int x = scanner.nextInt();
              int [] a = new int[10];
              for(int i = 0; i < n; i++) {
                      a[i]  = scanner.nextInt();
                      for(int j = 0; j < d; j = j + a[i]){
                                   sum++;
                     }
                } 
		System.out.print(X+sum);      }
}