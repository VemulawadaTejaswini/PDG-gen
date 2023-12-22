import java.util.*;
class Pare {
    int a;
    int b;
    public Pare(int a, int b) {
	this.a = a;
	this.b = b;
    }
    public int getA(){
	return a;
    }
}

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());
	Pare[] p = new Pare[N];

	for(int i = 0; i<N; i++) {
	    p[i] = new Pare(Integer.parseInt(sc.next()),Integer.parseInt(sc.next()));
	}
	Arrays.sort(p,Comparator.comparing(Pare::getA));

	int cnt = 0;
	for(int i = 0; i<N; i++) {
	    cnt += p[i].b;
	    if(cnt >= K) {
		System.out.println(p[i].a);
		return;
	    }
	}


    }
}