import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C =sc.nextInt();
      
      if(A%2==1 && B%2==1 && C%2==1){
        System.out.println(Math.min((long) A*B, Math.min((long) B*C, (long) A*C)));
      }else{
        System.out.println(0);
      }
    }
}
      