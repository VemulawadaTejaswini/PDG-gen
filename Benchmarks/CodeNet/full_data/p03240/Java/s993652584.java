import java.util.*;

class Main{
	static Scanner scan = new Scanner(System.in);
	static void programmingEducation(){
		int age = scan.nextInt();
		if(age == 1){
			System.out.println("Hello World");
		}
		else{
			int a = scan.nextInt(), b = scan.nextInt();
			System.out.println(a+b);
		}
		
	}
	
	static void timeLimit(){
		int n = scan.nextInt(), t = scan.nextInt();
		ArrayList<Integer> costs = new ArrayList<>();
		for(int i=0;i<n;i++){
			int input = scan.nextInt(), time = scan.nextInt();
			if(time<=t)
				costs.add(input);
		}
		Collections.sort(costs);
		if(costs.isEmpty())
			System.out.println("TLE");
		else{
			int cost = costs.get(0);
			System.out.println(cost);
		}
	}
	
	//全探索
	static void pyramid(){
		int n = scan.nextInt();
		int[] pX = new int[n], pY = new int[n], height = new int[n];
		for(int i=0;i<n;i++){ //入力
			pX[i] = scan.nextInt(); pY[i] = scan.nextInt(); height[i] = scan.nextInt();
		}
		int h;
		all: for(int i=0;i<101;i++){
			for(int j=0;j<101;j++){
				h = Math.abs(pX[0]-i) + Math.abs(pY[0]-j) + height[0];
				boolean flag = true;
				for(int k=1;k<n;k++){
					if(h != Math.abs(pX[k]-i) + Math.abs(pY[k]-j) + height[k]){
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.printf("%d %d %d",i,j,h);
					return;
				}
			}
		}
	}
	
	public static void main(String[] argv){
		//programmingEducation();
		//timeLimit();
		pyramid();
	}
	
}