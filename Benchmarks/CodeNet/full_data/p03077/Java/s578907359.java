import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		long[] minutes = new long[5];
		long n = stdIn.nextLong();
		long mini;
		long total = 5;
		for (int i = 0; i < 5; i++) {
			minutes[i] = stdIn.nextLong();
		}
		
		mini = n;
		
		for (int i = 0; i < 5; i++) {
			
			if (minutes[i] < n && minutes[i] < mini) {
					total += (n - minutes[i]) / minutes[i];
			}
			if (minutes[i] < mini) {
					mini = minutes[i];
			}
		}	
		
		System.out.println(total + 1);
	
	}
}