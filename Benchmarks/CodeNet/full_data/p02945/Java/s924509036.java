import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      if(A+B>=A-B&&A+B>=A*B){
        System.out.println(A+B);
      }else if(A-B>=A+B&&A-B>=A*B){
        System.out.println(A-B);
      }else if(A*B>=A+B&&A*B>=A-B){
        System.out.println(A*B);
      }
    }
}
      