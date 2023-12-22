import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			byte[] distances = new byte[5];
			byte k;
			for(int i = 0; i < 5; i++) {
				distances[i] = scan.nextByte();
			}
			k = scan.nextByte();
			
			boolean isOk = true;
			// a:=0, b:=1, c:=2, d:=3, e:=4 
			for(int i = 0; i < 5; i++){
				for(int j = i+1; j < 5; j++) {
					if(!isCommunicatable(distances[i], distances[j], k)) {
						isOk = false;
						break;
					}
				}
			}
			System.out.println(isOk ? "Yay!" : ":(");
		}
		
	}
	
	private static boolean isCommunicatable(int c1, int c2, int k) {
		return (c2 - c1) <= k;
	}
}
