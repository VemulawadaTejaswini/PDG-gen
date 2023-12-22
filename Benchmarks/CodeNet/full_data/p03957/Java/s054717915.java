import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		boolean flag = false;
		boolean yes = false;
		for(int i=0; i<S.length();i++){
			if(S.substring(i,i+1).equals("C")){
				flag = true;
			}
			if(S.substring(i,i+1).equals("F")&&flag){
				yes = true;
			}
		}
		if(yes){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}