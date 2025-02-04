import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args)throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		int cardList[] = new int[N];
		long result = 0;
		while(br.ready()) {
			int card = Integer.parseInt(br.readLine());
			cardList[count] = card;
			if(count!=0) {
				if(cardList[count-1]>0 && cardList[count]>0) {
					if(cardList[count-1]%2 !=0) {
						cardList[count] -= 1;
						result += 1;
					}
				}
				result  += cardList[count-1]/2;
			}
			count++;
		}
		result += cardList[N-1]/2;
		System.out.println(result);
	}
}