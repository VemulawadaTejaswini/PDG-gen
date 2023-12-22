import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
		}
		double minAbs = Double.MAX_VALUE;
		int minNo = 1;
		
		for(int i = 0;i < n;i++){
			if(minAbs > Math.abs(a-(t-h[i]*0.006))){
				minAbs = Math.abs(a-(t-h[i]*0.006));
				minNo = i+1;
			}
		}
		
		System.out.println(minNo);
	}
}
