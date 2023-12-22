import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a * 10 + b;
			if(a == 10){
				if(b < 10){
					System.out.println(9);
				}
				else{
					System.out.println(10);
				}
			}
			else if(a == 11){
				if(b < 11){
					System.out.println(10);
				}
				else{
					System.out.println(11);
				}
			}
			else if(a == 12){
				if(b < 12){
					System.out.println(11);
				}
				else{
					System.out.println(12);
				}
			}
			else {
				System.out.println(c / 11);
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
