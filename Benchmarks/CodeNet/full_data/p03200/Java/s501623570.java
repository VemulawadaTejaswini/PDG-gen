import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Boolean change=false;
		int count = -1;
		int[] osero = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'B') osero[i] = 1;
			else osero[i]=0;
		}
		do {
			change = false;
			count++;
			for(int i = 0; i < osero.length-1; i++) {
				if(osero[i] == 1 && osero[i+1] == 0) {
					osero[i] = 0;
					osero[i+1] = 1;
					change = true;
					break;
				}
			}
		}while(change);
		System.out.println(count);
	}

}