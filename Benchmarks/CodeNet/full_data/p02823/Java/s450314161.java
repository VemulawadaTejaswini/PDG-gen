import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    long count = 0;
		if((B-A)%2!=0) {
			if(A-1<=N-B) {
				count += A;
				count += (B-A-1)/2;
				System.out.println(count);
			}else{
				count += N-B+1;
				count += (B-A-1)/2;
				System.out.println(count);
			}
		}else {
			System.out.println((B-A)/2);
		}
	}
}
      
    