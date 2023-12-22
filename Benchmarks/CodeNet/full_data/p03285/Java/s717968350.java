import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int rest = N%7;
	for(int i = 0; i<25; i++) {
	    for(int j = 0; j<14; j++) {
		if(i*4+j*7 == N) {
		    System.out.println("Yes");
		    return;
		}
	    }
	}
	System.out.println("No");
    }
}