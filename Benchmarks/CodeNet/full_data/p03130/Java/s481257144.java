import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		int[] pathnum = new int[4];
		for(int i=0; i<4; i++){
			pathnum[i] = 0;
		}
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<6; i++){
			int path = sc.nextInt();
			pathnum[path-1]++;
		}
		
		int num1 = 0;
		int num2 = 0;
		for(int i=0; i<4; i++){
			if(pathnum[i] == 1){
				num1++;
			}
			if(pathnum[i] == 2){
				num2++;
			}
		}
		
		if(num1 == 2 && num2 == 2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}
