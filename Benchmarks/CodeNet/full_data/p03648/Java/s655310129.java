import java.util.*;

public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			long k = sc.nextLong();
			if(k % 3 == 0){
				long num = k / 3 + 2;
				StringBuilder ans = new StringBuilder();
				System.out.println(3);
				System.out.println(num + " " + num + " " + num);
			}
			else if(k % 3 == 1){
				long num = k / 3 + 2;
				StringBuilder ans = new StringBuilder();
				System.out.println(3);
				System.out.println(num -1 + " " + (num - 1) + " " + (num + 3));
			}
			else{
				long num = k / 3 + 2;
				StringBuilder ans = new StringBuilder();
				System.out.println(3);
				System.out.println(num - 2 + " " + (num + 2) + " " + (num + 2));
			}
		}
	}


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
