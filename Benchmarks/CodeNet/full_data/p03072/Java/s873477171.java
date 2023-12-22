import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int max = 0;
	int cnt = 0;
	for(int i = 0; i<N; i++) {
	    int yama = Integer.parseInt(sc.next());
	    if(max>yama) continue;
	    cnt++;
	    max = yama;
	}
	System.out.println(cnt);
    }
}