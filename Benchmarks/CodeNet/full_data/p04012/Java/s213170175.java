import java.util.*;
class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		int count = 0;
		for(char i = 'a'; i <='z'; i++) {
			for(int x = 0; x < W.length(); x++) {
				if(W.charAt(x) == i) {
					count += 1;
				}
			}
          if(count % 2 != 0){
            System.out.println("No");
            return;
		}
		System.out.println("Yes");
	}
}