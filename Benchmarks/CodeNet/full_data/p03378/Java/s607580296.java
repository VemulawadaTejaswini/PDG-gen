import java.util.*;


public class Main {
	public static void  main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		//总数
		int n = sc.nextInt();
		//数组长度
		int m = sc.nextInt();
		//初始位置
		int x = sc.nextInt();
		int arr[] = new int[m];
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		int flag[] = new int[n];
		for(int i= 0;i<flag.length;i++){
			flag[i] = 0;
		}
		
		for(int i= 0;i<flag.length;i++){
			for(int j= 0;j<arr.length;j++){
				if(arr[j] == i){
					flag[i] = 1;
				}
			}
		}
		int leftResult =0;
		int rightResult =0;
		for(int i=x;i>=0;i--){
			leftResult = leftResult + flag[i];
		}
		for(int i=x+1;i<n;i++){
			rightResult = rightResult + flag[i];
		}
		if(leftResult < rightResult){
			System.out.println(leftResult);
		} else{
			System.out.println(rightResult);
		}
		
	}
}
