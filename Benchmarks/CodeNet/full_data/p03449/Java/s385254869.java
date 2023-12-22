import java.util.Scanner;

class Main{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String[] S1 = s1.split(" "); 
		String[] S2 = s2.split(" "); 
		sc.close();
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			if(sum(i,S1,S2) > max) {
				max = sum(i,S1,S2);
			}
		}
		System.out.println(max);
	}
	public static int sum(int down, String[] S1, String[] S2) {
		int sum = 0;
		for( int i = 0; i <= down; i++ ) {
			sum += Integer.parseInt(S1[i]); 
		}
		for(int i = down; i < S2.length; i++){
			sum += Integer.parseInt(S2[i]);;
		}
		return sum;
	}
}