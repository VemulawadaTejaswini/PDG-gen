import java.util.*;
class Res {
    String s;
    int index;
    int p;
    public Res(int index, String s, int p) {
	this.index = index;
	this.s = s;
	this.p = p;
    }
}
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	Res[] res = new Res[n];

	for(int i = 0; i<res.length; i++) {
	    res[i] = new Res(i+1, sc.next(), Integer.parseInt(sc.next()));
	}
	
	Arrays.sort(res, (a,b) -> a.s.compareTo(b.s));

	int nextI = 1;
	for(int i = 0; i<n; i++) {
	    nextI = i;
	    while(nextI<n && res[i].s.equals(res[nextI].s)) {
		nextI++;
	    }
	    Res max = res[i];
	    for(int k = i; k<nextI; k++) {
		max = res[k];
		int ind = k;
		for(int l = i; l<nextI; l++) {
		    if(max.p < res[l].p) {
			ind = l;
			max = res[l];
			
		    }
		}
		res[ind].p = -1;
		System.out.println(res[ind].index);
	    }
	    i = nextI -1;
	}

    }
}