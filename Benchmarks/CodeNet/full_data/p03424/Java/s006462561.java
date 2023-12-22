import java.util.Scanner;
public class Main {
		 
			public static void main(String[] args) {
		        
				Scanner sc = new Scanner(System.in);
		 
				int n = sc.nextInt();
				String result = "Three";
				for (int i = 0; i < n; i++) {
					if (sc.next().equals("Y")) {
						result = "Four";
						break;
					}
				}
		 
				System.out.println(result);
			}
		 
		}