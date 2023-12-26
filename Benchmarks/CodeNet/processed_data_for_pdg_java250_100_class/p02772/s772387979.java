public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();  
		int shorui[] = new int[sum];  
		for(int i=0 ; i<sum ; i++) {
			shorui[i] = sc.nextInt();
			if(shorui[i]%2 == 0) {
				if(shorui[i]%3 == 0 || shorui[i]%5 == 0) {
					continue;  
				}
				else {  
					System.out.print("DENIED");  
					return;
				}
			}
			else {  
				continue;
			}
		}
		System.out.print("APPROVED");
	}
}
