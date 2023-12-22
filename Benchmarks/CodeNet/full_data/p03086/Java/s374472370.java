import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		for (int i=0; i<S.length(); i++){
			int count = 0;
			for (int j=i; j<S.length(); j++){
				if (S.charAt(j) == 'A' || S.charAt(j) == 'C'
						|| S.charAt(j) == 'G' || S.charAt(j) == 'T'){
					count++;
				}else{
					break;
				}
			}
			if (count>ans){
				ans = count;
			}
		}
		System.out.println(ans);

	}

}