import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayGround {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//System.out.println("starts...");
		//int n; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		char cA[] = a.toCharArray();
		char cB[] = b.toCharArray();
		char cC[] = c.toCharArray();
		int countA = 0;
		int countB = 0;
		int countC = 0;
		char turn = 'a';
		ser:while(true){
			if(turn == 'a'){
				if(countA == cA.length){
					System.out.print("A\n");
					break ser;
				}
				turn = cA[countA];
				countA++;
			}else
			if(turn == 'b'){
				if(countB == cB.length){
					System.out.print("B\n");
					break ser;
				}
				turn = cB[countB];
				countB++;
			}else
			if(turn == 'c'){
				if(countC == cC.length){
					System.out.print("C\n");
					break ser;
				}
				turn = cC[countC];
				countC++;
			}
		}
	}

}
