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
			
			int startData = point[i];
			int endData = point[i+stepNum-1];
			int result = getDis(startData, endData);
			ss = result > ss?ss:result;
		}
		
		System.out.println(ss);
		
	}
	
	public static int getDis(int a, int b) {
		
		if(b<=0){
			return Math.abs(a);
		}
		if(a>=0){
			return Math.abs(b);
		}
		return Math.abs(a)>Math.abs(b) ? Math.abs(a)+Math.abs(b)*2 :  Math.abs(a)*2+Math.abs(b);
	}
	
}
