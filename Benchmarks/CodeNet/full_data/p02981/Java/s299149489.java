import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();
      if(N*A<B){
        System.out.print(N*A);
      }
      else if(N*A>B){
             System.out.print(B);
      }
      else{
               System.out.print(B);
      }
			
		}
	}
