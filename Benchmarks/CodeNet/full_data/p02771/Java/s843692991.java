import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String A = sc.next();
      String B = sc.next();
      String C = sc.next();
      if(A.equals(B)&&B.equals(C)&&C.equals(A)){
        System.out.println("No");
      }else if(!(A.equals(B)||B.equals(C)||C.equals(A))){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
    }
}