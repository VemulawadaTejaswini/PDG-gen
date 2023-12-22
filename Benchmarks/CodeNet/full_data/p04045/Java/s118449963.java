import java.util.*;
class Main {
    static boolean[] isDislike;
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	isDislike = new boolean[10];
	for(int i = 0; i<K; i++) {
	    isDislike[sc.nextInt()] = true;
	}
	for(int i = N; i<N*10+N%10; i++) {
	    if(!isDislikedNumber(i)) {
		System.out.println(i);
		return;
	    }
	}
    }
    public static boolean isDislikedNumber(int num) {
	int dig = 0;
	while(num>0) {
	    dig = num%10;
	    if(isDislike[dig]) {
		return true;
	    }
	    num/=10;
	}
	return false;
    }
}