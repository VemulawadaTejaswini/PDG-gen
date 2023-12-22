import java.util.*;

class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int X = sc.nextInt();
	int cnt = 0;
	for(int i = 0; i <= A; i ++) {
	    for(int j = 0; j <= B; j++) {
		int k = (X - i * 500 - j * 100) / 50;
		if(k >= 0 && k <= C) {
		    cnt ++;
		}
	    }
	}
	    
	System.out.println(cnt);
    }
}
