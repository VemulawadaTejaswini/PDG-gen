import java.util.*;

public class Main {
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		ArrayList<String> x = new ArrayList<String>();
		int i;
		int count = 0, countM = 0, countA = 0, countR = 0, countC = 0, countH = 0;
		for(i = 0; i < N; i++){
			String name = sc.next();
			char c = name.charAt(0);
			if(c == 'M'){
				countM++;
				count++;
			}else if(c == 'A'){
				countA++;
				count++;
			}else if(c == 'R'){
				countR++;
				count++;
			}else if(c == 'C'){
				countC++;
				count++;
			}else if(c == 'H'){
				countH++;
				count++;
			}
		}
		
		if(count == 0){
			System.out.println(0);
		}else{
			int ans = countM * (countA *(countR + countC + countH) + countR *(countC + countH) + countC * countH) + countA *(countR * (countC + countH) + countC * countH) + countR * countC * countH; 
			System.out.println(ans);
		}
	}
}
