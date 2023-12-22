import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
 
		if(b - a < k*2) {
			for(int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			for(int i = a; i < a+k; i++) {
				System.out.println(i);
			}
			for(int i = b-k+1; i <= b; i++) {
				System.out.println(i);
			}
		}
    }
}