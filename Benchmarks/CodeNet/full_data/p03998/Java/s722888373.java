import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String C = sc.next();

		String next = A.substring(0, 1);
		A = A.substring(1, A.length());
		//System.out.println(A);
		for(;;){
			if(next.equals("a")){
				if(A.isEmpty()){
					System.out.println("A");
					return;
				}
				next = A.substring(0, 1);
				A = A.substring(1, A.length());
			}else if(next.equals("b")){
				if(B.isEmpty()){
					System.out.println("B");
					return;
				}
				next = B.substring(0, 1);
				B = B.substring(1, B.length());
			}else{
				if(C.isEmpty()){
					System.out.println("C");
					return;
				}
				next = C.substring(0, 1);
				C = C.substring(1, C.length());
			}
		}
    }
}
