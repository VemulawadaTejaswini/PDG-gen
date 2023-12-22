
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String remark = scanner.next();
		boolean rArray[] = new boolean[num];
		for(int i = 0; i < remark.length(); i++){
			if(remark.charAt(i) == 'o'){
				rArray[i] = true;
			} else {
				rArray[i] = false;
			}
		}
		
		for(int i = 0; i < 4; i++){
			boolean ans[] = new boolean[num];
			if(i == 0){
				ans[0] = true;
				ans[1] = true;
			} else if (i == 1){
				ans[0] = true;
				ans[1] = false;
			} else if (i == 2){
				ans[0] = false;
				ans[1] = true;
			} else if (i == 3){
				ans[0] = false;
				ans[1] = false;
			}
			
			int j = 1;
			while(j < num - 1){
				if(ans[j]){
					// Sheep
					if(rArray[j]){
						// o
						ans[j + 1] = ans[j - 1];
					} else {
						// x
						ans[j + 1] = ans[j - 1] ^ true;
					}
				} else {
					// Wolf
					if(rArray[j]){
						// o
						ans[j + 1] = ans[j - 1] ^ true;
					} else {
						// x
						ans[j + 1] = ans[j - 1];
					}
				}
				j++;
			}
			
			if(ans[j]){
				// sheep
				if(rArray[j]){
					if(ans[j - 1] == ans[0]){
						printAns(ans);
						return;
					}
				} else {
					if(ans[j - 1] != ans[0]){
						printAns(ans);
						return;
					}
				}
			} else {
				// wolf
				if(rArray[j]){
					if(ans[j - 1] != ans[0]){
						printAns(ans);
						return;
					}
				} else {
					if(ans[j - 1] == ans[0]){
						printAns(ans);
						return;
					}
				}
			}
			
		}
		System.out.println(-1);
	}
	
	public static void printAns(boolean[] arg){
		for(int i = 0; i < arg.length; i++){
			if(arg[i]){
				System.out.print("S");
			} else {
				System.out.print("W");
			}
		}
		System.out.println();
	}
}