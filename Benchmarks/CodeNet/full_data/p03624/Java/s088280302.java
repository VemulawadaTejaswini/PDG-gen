import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		
		char alpha = 'a';
		
		for(int i =0; i < 26; i++){
			if(S.indexOf(String.valueOf(alpha)) == -1){
				System.out.println(alpha);
				return;
			}
			else{
				alpha++;
			}
		}
		System.out.println("None");
	}

}