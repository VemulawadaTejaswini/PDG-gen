public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long blue = sc.nextLong();
		long red = sc.nextLong();
		long remainder = num%(blue+red);  
		long countBlue = num/(blue+red)*blue;  
		if(remainder >= blue) {  
			countBlue += blue;  
		}
		else {                      
			countBlue += remainder;  
		}
		System.out.print(countBlue);
		sc.close();
	}
}
