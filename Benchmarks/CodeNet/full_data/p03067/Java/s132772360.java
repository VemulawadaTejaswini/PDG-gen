import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      if(A < B && A < C){
        System.out.println((B > C) ? "Yes" : "No");
      }else if(A > B && B < C){
        System.out.println("Yes");
      }else{
        System.out.println((C > B) ? "Yes" : "No");
      }
	}
}
