import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			String s = sc.next();
			
			//R...RL...Lのブロックに分離してそれぞれごとに集計すればよい
			//RRRLLの場合
			//RLRLR
			
			char L = 'L';
			char R = 'R';
			
			char[] sArray = (s + "T").toCharArray();
			int[] result = new int[s.length()];
			
			int start = 0;
			int sep = 0;
			boolean isRight = true;
			for(int i = 0 ; i < sArray.length ; i++ ) {
				if ( isRight ) {
					if ( sArray[i] == R ) {
						//continue
					}
					else {
						//divider
						isRight = false;
						sep = i;
						continue;
					}
				}
				else {
					if ( sArray[i] == L ) {
						//continue
					}
					else {
						//termination, so count it
						int blockLen = i - start;
						int sepCountA = (blockLen / 2) + (blockLen % 2);
						int sepCountB = blockLen / 2;
						result[sep-1] = sepCountA;
						result[sep] = sepCountB;
						
						start = i;
						isRight = true;
					}
				}
			}
			
			for(int i = 0 ; i < result.length ; i++ ) {
				System.out.print(result[i] + " ");
			}
		}
	}
}