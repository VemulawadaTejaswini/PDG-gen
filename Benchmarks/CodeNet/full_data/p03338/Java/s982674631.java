import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		String string = sc.next();		
		int ans = 0;

		for(int i = 0;i = N;i++){
			int sub = 0;
			char[] mae = string.substring(0,i).toCharArray();
			char[] ushiro = string.substring(i).toCharArray();

			Arrays.sort(mae);
			//Arrays.sort(ushiro);

			int j = 0;
			while(true){
				if(j >= mae.length){
					break;
				}



				while(true){
					if(j == mae.length-1){
						break;
					}
					if(mae[j] != mae[j+1]){			//aab みたいな時二つ目に移動
						break;
					}
					j++;
				}
				
				for(int k = 0;k < ushiro.length;k++){			//後ろにあるか判定
					if(mae[j] == ushiro[k]){
						sub++;
						break;
					}

				}
				j++;

			}
			ans = Math.max(ans, sub);

		}

		System.out.println(ans);

	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



