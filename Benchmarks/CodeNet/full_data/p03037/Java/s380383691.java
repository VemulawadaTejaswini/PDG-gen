import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	int l = Integer.parseInt(sc.next());
	int r = Integer.parseInt(sc.next());
	for(int i = 1; i<m; i++) {
	    int tmpL = Integer.parseInt(sc.next());
	    int tmpR = Integer.parseInt(sc.next());
	    if(l<tmpL) l=tmpL;
	    if(tmpR<r) r= tmpR;
	}
	System.out.println(Math.max(r-l+1,0));

    }
}