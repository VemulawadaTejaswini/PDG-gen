import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
      	int ans = 0;
		for (int i = 1; i <= count; i++){
			String tmp1 = String.valueOf(i);
			for(int j = 1; j <= i; j++){
				String tmp2 = String.valueOf(j);
				if (tmp1.substring(0,1).equals(tmp2.substring(tmp2.length() - 1)) && tmp1.substring(tmp1.length() - 1).equals(tmp2.substring(0,1))){
             		 ans++;
             		if ( i != j){
					ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

}