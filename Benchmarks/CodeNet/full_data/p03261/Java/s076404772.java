import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String W = sc.next();
		 Set<String> list = new HashSet<String>();
		 list.add(W);
		 String ans = "Yes";

		for(int i = 1; i < N; i++){
			String W1 = W;
			String W2 = sc.next();
			if(W1.charAt(W.length() - 1) == W2.charAt(0)){
				W = W2;
				list.add(W);
			}else{
				ans = "No";
				break;
			}
		}

		if(list.size() != N){
			ans = "No";
		}

		System.out.println(ans);


	}
}