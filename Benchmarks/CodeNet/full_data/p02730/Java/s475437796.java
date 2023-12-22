import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		String kaibun = new Scanner(System.in).next();
		int hello = 0;
		
		for(int i = 0; i < (kaibun.length() - 1) / 2;i++) {
			if(kaibun.charAt(i) != kaibun.charAt(kaibun.length() - 1 - i)) {
				System.out.println("No");
				System.exit(0);
				
			}
			
		}
		
		if(kaibun.length() == 3) {
			System.out.println("Yes");
			System.exit(0);
			
		}else if((double)((kaibun.length() - 1)/2)/2 == (double)(((kaibun.length() -1)/2 -1 ) /2)) {
			hello = ((kaibun.length() - 1) /2) /2;
			
		}else {
			hello = ((kaibun.length() - 1) /2 - 1) /2;
			
		}
		
		for(int i = 0; i < hello; i++){
			if(kaibun.charAt(i) != kaibun.charAt((kaibun.length() - 1) / 2 - 1 - i)){
				System.out.println("No");
				System.exit(0);
				
			}
			
		}
		
		System.out.println("Yes");
		
	}
	
}