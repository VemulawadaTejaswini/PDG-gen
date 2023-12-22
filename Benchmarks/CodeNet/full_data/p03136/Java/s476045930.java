import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = 0, sum = 0;
		for(int i = 0; i < num; i++){
			int len = sc.nextInt();
			if(len > max){
				sum += max;
				max = len;
			}else sum += len;
		}

		String ans = max < sum ? "Yes" : "No";
		System.out.println(ans);
	}
}


