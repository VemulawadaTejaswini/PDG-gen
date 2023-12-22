import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean [] key= new boolean[10];
		String n= in.next();
		int k= in.nextInt();
		Arrays.fill(key, true);
		for (int i = 0; i < k; i++) {
			key[in.nextInt()]= false;
		}
		String res= "";
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < key.length; j++) {
				if(n.charAt(i)-'0'<=j&&key[j]){
					res+=String.valueOf(j);
					break;
				}
			}
		}
		System.out.println(res);
		
	}
}
