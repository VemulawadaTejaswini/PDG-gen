import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[][] pos = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				pos[i][j] = sc.nextInt();
			}
		}
		int ansN = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(pos[i][j]%2 == 1){
					if(j == w-1){
						if(i != h-1 ){
							ansN++;
							ans.add(i);ans.add(j);ans.add(i+1);ans.add(j);
						}
					}else{
						ansN++;
						ans.add(i);ans.add(j);ans.add(i);ans.add(j+1);
					}
					
				}
			}
		}
		System.out.println(ansN);
		for(int i=0;i<ansN;i++){
			System.out.println(ans.get(i*4)+" "+ans.get(i*4+1)+" "+ans.get(i*4+2)+" "+ans.get(i*4+3));
		}
		
;	}
}
