import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean f = true;
	int c[] = new int[4];
	for(int i = 0; i< 3; i++) {
	    c[sc.nextInt()-1]++;
	    c[sc.nextInt()-1]++;
	}
	for(int i = 0; i< 4; i++) {
            if(c[i]>=3) f = false;
        }
	if(f) {
	    System.out.println("YES");
	}else {
	    System.out.println("NO");
	}
    }
}