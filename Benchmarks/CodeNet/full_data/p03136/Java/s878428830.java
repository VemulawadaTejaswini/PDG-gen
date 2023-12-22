import java.util.*;

public class Main{
	public static  void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new num[n];
		int max = num[0];
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++){
			num[i] = scan.nextInt();
			System.out.println(num[i] + " ");
			if(max > num[i]){
				max = num[i];
			}else{
				sum += num[i];
			}
		}
		
		if(max < sum + 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}