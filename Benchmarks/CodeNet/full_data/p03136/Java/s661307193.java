import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int num = 0;
		for(int i = 0; i < n; i++){
			int l = sc.nextInt();
			if(l > max){
				num = num + max;
				max = l;
			}else{
				num = num + l;
			}
		}
		if(max < num){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}
