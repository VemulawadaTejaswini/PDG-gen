import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num = 0;
		if(M==1 && N==1)num = 1;
		else if(M>=3 && N==1)num = M-2;
		else if(M==1 && N>=3)num = N-2;
		else if(M==2 || N==2)num = 0;
		else if(M>=3 && N>=3)num = N*M - 2*(N+M-2);
		System.out.println(num); 		
	}
}
	