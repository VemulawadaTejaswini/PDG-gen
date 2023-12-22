
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt();
		
		char[][] map = new char[n][];
		
		for(int i =0; i < n ; i++){
			map[i] = sc.next().toCharArray();
		}
		
		
		int ans = 0;
		
		
		for(int k = 0 ; k  < n ; k++){
			
			
			boolean flag = true;
			for(int i = 0; i < n ; i++){
				for(int j = i+1;j<n;j++){
					
					int ii = (i +k)%n;
					int jj = j;
					
					int jjj = i;
					int iii = (j+k)%n;
					
					flag &= map[ii][jj] == map[iii][jjj];
					if(!flag){
						break;
					}
				}
				if(!flag){
					break;
				}
			}
			
			if(flag){
				ans++;
			}
		}
		
		
		System.out.println(ans*n);
		
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}