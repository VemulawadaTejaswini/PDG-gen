import java.util.*;


public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int n = a % 500;
			if(n <= b){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
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
