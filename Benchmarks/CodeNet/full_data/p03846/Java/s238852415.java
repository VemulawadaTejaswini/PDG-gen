import java.util.*;

public class Main {
	//static int Border = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i=0;i<N;i++){
			int x = sc.nextInt();
			if(map.containsKey(x)){
				map.put(x, map.get(x)+1);
			}else{
				map.put(x, 1);
			}
		}
		
		boolean flag = true;
		
		for(int i=0;i<(N+1)/2&&flag;i++){
			if(N%2==0){
				flag = false;
				if(map.containsKey((i-1)*2+1)){
					if(map.get((i-1)*2+1)==2){
						flag=true;
					}
				}
			}
			if(N%2==1){
				if(i==0){
					flag = false;
					if(map.containsKey(0)){
						if(map.get(0)==1){
							flag=true;
						}
					}
				}
				else{
					flag=false;
					if(map.containsKey(2*N)){
						if(map.get(2*N)==2){
							flag=true;
						}
					}
					
				}
			}
		}
		
		if(!flag){
			System.out.println(map.get(2));
			System.out.println(0);
		}
		else{
			long num = (long)Math.pow(2,(N/2));
			num = num%1000000007;
			System.out.println(num);
		}
		
	}
	
}