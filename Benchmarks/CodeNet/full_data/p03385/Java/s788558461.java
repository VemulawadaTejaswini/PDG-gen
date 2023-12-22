import java.util.*;

public class Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] n = new String[3];
		int counterA = 0;
		int counterB = 0;
		int counterC = 0;

		for(int i = 0; i < 3; i++){
			String a = sc.next();
			n[i] = a;
		}

		for(int j = 0; j < 3; j++){
			if(n[j].equals("a")){
				counterA++;
			}else if(n[j].equals("b")){
				counterB++;
			}else if(n[j].equals("c")){
				counterC++;
			}
		}

		if(counterA == 1 && counterB == 1 && counterC == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}