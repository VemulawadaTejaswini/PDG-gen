import java.util.Scanner;

public class Main{
	
	static int[] point;
	static int stepNum;
	static int num;
	static int ss = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		stepNum = sc.nextInt();
		boolean flag = true;
		int start  = -1;
		point = new int[num];
		
		int arrStart = -1;
		
		for(int i = 0 ; i < point.length; i++){
			int temp = sc.nextInt();
			if(temp >= 0 && flag){
				start = i;
				flag = false;
			}
			point[i] = temp;
		}
		
		if(start == -1){
			System.out.println(Math.abs(point[arrStart]));
			return;
		}
		
		if(start == 0) {
			System.out.println(Math.abs(point[stepNum-1]));
			return;
		}
		
		if(start >= stepNum+1 ){
			arrStart = start - stepNum;
		}
		
		if(start <= stepNum){
			arrStart = 0;
		} 
		
		for(int i = arrStart; point[i] <= 0 && i+stepNum-1 < num ; i++){
			
			int[] arr = getArr(i, i+stepNum-1);
			int dis = getDis(arr);
			if(ss >= dis){
				ss = dis;
			}
		}
		
		System.out.println(ss);
		
	}
	
	public static int getDis(int[] arr) {
		
		int start =  0;
		int end = arr.length-1;
		boolean startGtZ = arr[start] <= 0 ; 
		if(startGtZ && arr[end]==0) {
			return  Math.abs(arr[0]-arr[end]);
		}else if(startGtZ && arr[end]>0){
			int path1 = Math.abs(arr[0]-arr[end]);
			if( Math.abs(arr[start]) >  Math.abs(arr[end])) {
				return  path1+Math.abs(arr[end]);
			} else {
				return  path1+Math.abs(arr[0]);
			}
			
		}else if(arr[start]>=0){
			return  arr[end];
		}else if(arr[end] < 0){
			return  Math.abs(arr[0]);
		}
		
		return -1;
	}
	
	public static int[] getArr(int start, int end){
		int[] arr = new int[end - start+1];
		
		for(int i = start; i <= end; i++) {
			arr[i-start] = point[i];
		}
		
		return arr;
	}
	
}
