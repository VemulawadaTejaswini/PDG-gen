import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input  = new Scanner(System.in);
		int N = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		input.nextLine();
		String S = input.nextLine();
		input.close();	
		int curNum = 0;
		int overNum = 0;
		for(int i = 0; i < N;i++){
			if(S.charAt(i)=='c') {
				System.out.println("No");
			}else if (S.charAt(i)=='a'){
				if(curNum < (A+B)){
					System.out.println("Yes");
					curNum++;
				}else System.out.println("No");
			}else{
				if(curNum < (A+B) && overNum < B){
					System.out.println("Yes");
					curNum++;
					overNum++;
				}else System.out.println("No");
			}
		}
		
	}


}
