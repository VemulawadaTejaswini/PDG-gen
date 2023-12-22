import java.util.Scanner;

 class Contact {
	public static void main(String[] args) {
		
Contact();
}

	private static int Contact() {
		Scanner in = new Scanner(System.in);
		int noSocketsPer= in.nextInt();//x
		int proSockets= in.nextInt();//y
		int count=0;
		int counter=0;
		if(noSocketsPer>=proSockets)
			return 1;
		
		while(count<(proSockets-noSocketsPer)) {
			count+=(noSocketsPer-1);
			counter++;
		}
		count+=noSocketsPer;
			return ++counter;
	}
}