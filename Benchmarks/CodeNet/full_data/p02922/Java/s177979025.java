import java.util.*;

class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int s= 1;
		
		for(int i = 0;;i++){
			if((i*A) + 1 > B){
				s = i;
				break;
			}
			
		}
		System.out.println(s);
	}
}