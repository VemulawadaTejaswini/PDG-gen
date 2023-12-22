import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String ans = "Yes";

		int prev = 0;
		int max = 0;
		for(int i = 0; i < num; i++){
			int height = sc.nextInt();
			if(prev-1 > height){
				ans = "No";
				break;
			}else if(prev > height){
				if(height < max-1){
					ans = "No";
					break;
				}
			}
			max = Math.max(height, max);
			prev = height;
		}
		
		System.out.println(ans);
	}
}


