import java.util.*;
class Card {
    int b;
    int c;
    public Card(int b, int c) {
	this.b = b;
	this.c = c;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int m = Integer.parseInt(sc.next());
	long[] a = new long[n];
	
	for(int i = 0; i<n; i++) {
	    a[i] = Long.parseLong(sc.next());
	}
	Arrays.sort(a);

	Card[] ca = new Card[m];
	for(int i = 0; i<m; i++) {
	    int b = Integer.parseInt(sc.next());
	    int c = Integer.parseInt(sc.next());
	    ca[i] = new Card(b,c);
	}

	Arrays.sort(ca, (ax,bx)-> bx.c - ax.c);

	Long[] tmp = new Long[n];
	int count = 0;
	for(int i = 0; i<m; i++) {
	    Card card = ca[i];
	    for(int j = 0; j<card.b; j++) {
		if(count==n)break;
		tmp[count] = (long)card.c;
		count++;
	    }
	    if(count==n)break;
	}
	for(int i = count; i<n; i++) {
	    tmp[i]=0L;
	}

	Arrays.sort(tmp, Comparator.reverseOrder());

	for(int i = 0; i<n; i++) {
	    if(a[i] < tmp[i]) {
		a[i] = tmp[i];
	    }else {
		break;
	    }

	}

	long total = 0;
	for(int i = 0; i<n; i++) {
	    total += a[i];
	}
	System.out.println(total);
    }
}