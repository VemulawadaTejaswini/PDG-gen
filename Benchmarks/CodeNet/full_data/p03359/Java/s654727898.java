import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int countTakahashi = 0;
		int a = 0;
		int b = 0;
		
	    Scanner scan = new Scanner(System.in);
		
		for(int i = 1 ; i <= a ; i++){
			for(int j = 1 ; j <= b ; j++){
				if(i==j){
					countTakahashi++;
				}
			}
		}
		System.out.println(countTakahashi);
	}

}