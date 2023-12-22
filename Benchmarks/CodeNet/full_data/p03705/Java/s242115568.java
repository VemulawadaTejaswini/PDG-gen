import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		if(B<A){
			System.out.println(0);
		}
		else if(N==1){
			if(B!=A){
				System.out.println(0);
			}
			if(B==A){
				System.out.println(1);
			}
		}
		else{
			System.out.println(B*(N-2)-A*(N-2)+1);
		}
	}
}