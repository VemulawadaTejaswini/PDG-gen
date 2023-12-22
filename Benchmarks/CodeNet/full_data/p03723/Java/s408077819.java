import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	if(a == b && b==c) {
	    System.out.println(-1);
	    return;
	}
	int cnt = 0;
	while(a%2==0 && b%2==0 && c%2==0) {
	    int tmpa = a;
	    int tmpb = b;
	    int tmpc = c;
	    a = tmpb/2 + tmpc/2;
	    b =tmpa/2 + tmpc/2;
	    c =tmpb/2 + tmpa/2;
	    cnt++;
	}
	
	System.out.println(cnt);

    }
}