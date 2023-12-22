import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		char[] c1 = scanner.nextLine().toCharArray();
		char[] c2 = scanner.nextLine().toCharArray();
		boolean answer = true;

		for(int i = 0; i < 3; i++){
			if(c1[i] != c2[2-i]){
				answer = false;
				break;
			}
		}

		if(answer == true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}