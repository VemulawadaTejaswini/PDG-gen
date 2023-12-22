import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	int p1 = 0;
	int p2 = 0;
	int p3 = 0;
	for(int i = 0; i< N; i++) {
	    int current = sc.nextInt();
	    if(current<=a) p1++;
	    else if(current<=b) p2++;
	    else p3++;
	}
	int result = Math.min(p1,p2);
	System.out.println(Math.min(result,p3));
    }

}