import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		ArrayDeque<Comb> deq = new ArrayDeque<>();
		ArrayDeque<Comb> next = new ArrayDeque<>();
		deq.add(new Comb());
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    while(deq.size() > 0) {
		        Comb cc = deq.poll();
		        next.add(cc.addA(x));
		        next.add(cc.addB(x));
		        next.add(cc.addC(x));
		        next.add(cc);
		    }
		    ArrayDeque<Comb> tmp = next;
		    next = deq;
		    deq = tmp;
		}
		int min = Integer.MAX_VALUE;
		while (deq.size() > 0) {
		    Comb cc = deq.poll();
		    min = Math.min(min, cc.getPoint(a, b, c));
		}
		System.out.println(min);
	}
    
    static class Comb {
        int aLen;
        int bLen;
        int cLen;
        int point;
        
        public Comb(int aLen, int bLen, int cLen, int point) {
            this.aLen = aLen;
            this.bLen = bLen;
            this.cLen = cLen;
            this.point = point;
        }
        
        public Comb() {
            this(0, 0, 0, 0);
        }
        
        public Comb addA(int x) {
            int add = 0;
            if (aLen > 0) {
                add = 10;
            }
            return new Comb(aLen + x, bLen, cLen, point + add);
        }
        
        public Comb addB(int x) {
            int add = 0;
            if (bLen > 0) {
                add = 10;
            }
            return new Comb(aLen, bLen + x, cLen, point + add);
        }
        
        public Comb addC(int x) {
            int add = 0;
            if (cLen > 0) {
                add = 10;
            }
            return new Comb(aLen, bLen, cLen + x, point + add);
        }
        
        public int getPoint(int a, int b, int c) {
            if (aLen == 0 || bLen == 0 || cLen == 0) {
                return Integer.MAX_VALUE;
            }
            point += Math.abs(aLen - a) + Math.abs(bLen - b) + Math.abs(cLen - c);
            return point;
        }
    }
    	
}
