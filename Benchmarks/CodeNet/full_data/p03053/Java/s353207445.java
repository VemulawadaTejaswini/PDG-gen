import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[][] strArray = new String[H][W];

		for(int i=0; i<H; i++){
			strArray[i] = sc.next().split("");
		}


		int ans = 0;
		ans++;
		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++){
				if(strArray[i][j].equals(".")){
					ans = Math.max(ans, getLength(i, j, strArray, H, W));
				}
			}
		}

		System.out.println(ans);

	}

	static int getLength(int i, int j, String[][] strArray, int H, int W){

		int length = 1001;

		//左を更新
		if(j>0){
			int tmpLength =  0;
			for(int n=j-1; n>=0; n--){
				if(strArray[i][n].equals("#")){
					length = Math.min(length,tmpLength);
				}else{
					tmpLength++;
				}
			}
		}

		//右を更新
		if(j<H){
			int tmpLength =  0;
			for(int n=j+1; n<H; n++){
				if(strArray[i][n].equals("#")){
					length = Math.min(length,tmpLength);
				}else{
					tmpLength++;
				}
			}
		}

		//上を更新
		if(i>0){
			int tmpLength =  0;
			for(int n=i-1; n>=0; n--){
				if(strArray[n][j].equals("#")){
					length = Math.min(length,tmpLength);
				}else{
					tmpLength++;
				}
			}
		}

		//下を更新
		if(i<W){
			int tmpLength =  0;
			for(int n=i+1; n<W; n++){
				if(strArray[n][j].equals("#")){
					length = Math.min(length,tmpLength);
				}else{
					tmpLength++;
				}
			}
		}

		return length;
	}

	static boolean isAllBlack(String[][] strArray, int H, int W){
		boolean isAllBlack = true;

		for(int i=0; i<H; i++){
			for(int j=0; j<W; j++){
				if(strArray[i][j].equals(".")){
					return false;
				}
			}
		}

		return isAllBlack;
	}

}