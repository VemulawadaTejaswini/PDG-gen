import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int r = Integer.parseInt(sc.next());
	int g = Integer.parseInt(sc.next());
	int b = Integer.parseInt(sc.next());
	int n = Integer.parseInt(sc.next());
	int cnt = 0;
	for(int i = 0; i<=n; i++) {
	    for(int j = 0; j<=n; j++) {
		if((n-r*i-g*j )%b==0 && (n-r*i-g*j ) >= 0) {
		    cnt++;
		}
	    }
	}

	System.out.println(cnt);

    }
}