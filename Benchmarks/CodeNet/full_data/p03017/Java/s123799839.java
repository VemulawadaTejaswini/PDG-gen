import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int A  = keyboard.nextInt();
		int B  = keyboard.nextInt();
		int C  = keyboard.nextInt();
		int D  = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] masu = S.split("");
		
		String ans = "Yes";
		if(C > D) {
			if(masu[D-2].equals("#")|| masu[D].equals("#")) {
				ans = "No";
			}
		
		
		int count = 1;
		for(int m = B-2; m <= D; m++) {
			if(masu[m].equals("#")) {
				count = 0;
			} else {
				count++;
				if(count == 3) {
					ans = "Yes";
					break;
				}
			}
		}	
        }
		
  		int StartB = B;	

		if(ans.equals("Yes")) {
			for(int i = B-1; i < D-1; i++) {
				if(masu[i+1].equals(".")) {
					StartB++;
					if(StartB == D) {
						ans = "Yes";
						break;
					}else if(StartB > D) {
						ans = "No";
						break;
					}
				}else if(masu[i+2].equals(".")) {
					StartB+=2;
                  	i++;
					if(StartB == D) {
						ans = "Yes";
						break;
					}else if(StartB > D) {
						ans = "No";
						break;
					}
				}else {
					ans = "No";
					break;
				}
			}
		}

		int StartA = A;
		
		if(ans.equals("Yes")) {
			for(int i = A-1; i < C-1; i++) {
				if(masu[i+1].equals(".")) {
					StartA++;
					if(StartA == C) {
						ans = "Yes";
						break;
					}else if(StartA > C) {
						ans = "No";
						break;
					}
				}else if(masu[i+2].equals(".")) {
					StartA+=2;
                  	i++;
					if(StartA == C) {
						ans = "Yes";
						break;
					}else if(StartA > C) {
						ans = "No";
						break;
					}
				}else {
					ans = "No";
					break;
				}

			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
