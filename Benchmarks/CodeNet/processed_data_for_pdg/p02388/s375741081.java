public class Main {
public static void main(String[] args) {
	int count = 2;
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();
	int result = x;
	if(1<=x && x<= 100) {
	for(int i = 0; i < count; i++) {
		 result = result *x;
	}
	System.out.println(result);
	}
	sc.close();
	}
	}
