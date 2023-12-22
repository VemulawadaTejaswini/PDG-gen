import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args){
		
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
				scanner.nextInt();
		String[] str = new String[n];
	
		for(int i=0; i<n; i++){
			str[i] = scanner.next();
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i!=j){
					if(str[j].compareTo(str[i]) >= 0){
						String tmp = str[i];
						str[i] = str[j];
						str[j] = tmp;
					}
				}
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(str[i]);
		}
		
	}
}