import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int countTakahashi = 0;
		int a,b = 0;
		
	    Scanner scan = new Scanner(System.in);
	    a =  Integer.parseInt(scan.next());
	    b =  Integer.parseInt(scan.next());
	    
	    
		
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
