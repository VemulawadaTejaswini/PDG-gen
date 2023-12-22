import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		for(int i = 0;i<19;i++){
			if(i != 5 && i != 13){
				System.out.print(S.charAt(i));
			} else {
				System.out.print(" ");
			}
		}
	}
}

