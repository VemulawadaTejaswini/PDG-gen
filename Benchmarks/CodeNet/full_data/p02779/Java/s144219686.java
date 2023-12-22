import java.util.*;

class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		Set<String> list = new HashSet<String>();

		for(int i = 0; i<N; i++){
			String A = sc.next();
			list.add(A);
		}

		if(N==list.size())
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
}