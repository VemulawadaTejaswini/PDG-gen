import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int[] n = new int[24];
	int ch = 0;
	for(int i = 1; i <= s.length(); i++){
		char c = s.charAt(i);
		int nn = (int)(c - 97);
		n[nn]++;
		nn = 0;
	}
	for(int i = 0; i < n.length; i++){
		if(n[i] % 2 == 1){
			ch = 1;
		}
	}
	if(ch == 1){
		System.out.println("No");
	}else{
		System.out.println("Yes");
	}
}
}
