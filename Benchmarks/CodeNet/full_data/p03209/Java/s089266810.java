import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
		Bargar b = new Bargar(n);
		System.out.println(b.getAmount(x));
    }
    
    static class Bargar {
        int size;
        long count;
        long paties;
        
        Bargar inside;
        
        public Bargar (int size) {
            this.size = size;
            if (size == 0) {
                count = 1;
                paties = 1;
            } else {
                inside = new Bargar(size - 1);
                count = inside.count * 2 + 3;
                paties = inside.paties * 2 + 1;
            }
        }
        
        public long getAmount(long total) {
            long ans = 0;
            total--;
            if (total <= 0) {
                return ans;
            }
            if (total <= inside.count) {
                return inside.getAmount(total);
            }
            ans += inside.paties;
            total -= inside.count;
            if (total <= 0) {
                return ans;
            }
            total--;
            ans++;
            if (total <= 0) {
                return ans;
            }
            return ans + inside.getAmount(total);
        }
    }
}

