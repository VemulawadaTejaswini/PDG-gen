import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      int A = sc.nextInt();
      int B = sc.nextInt();
      String U = sc.next();
      if(S.equals(U)){
        System.out.println((A-1) +" "+ B);
      }else if(T.equals(U)){
        System.out.println(A + " " + (B-1));
      }
    }
}