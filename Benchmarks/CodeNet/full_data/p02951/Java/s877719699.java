import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
      	int B = sc.nextInt();
		int C = sc.nextInt();
      int X = C-(A-B);
        if(X>0){
        System.out.print(0);
        }
      else{
		System.out.print(C-(A-B));
      }
	}
}
