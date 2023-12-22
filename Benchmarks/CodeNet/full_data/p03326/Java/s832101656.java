import java.util.*;
import java.util.stream.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        List<Cake> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new Cake(in.nextLong(), in.nextLong(), in.nextLong()));
        }

        Calculate[] calcs = {
            c ->   c.getX() + c.getY() + c.getZ(),
            c ->   c.getX() + c.getY() - c.getZ(),
            c ->   c.getX() - c.getY() + c.getZ(),
            c ->   c.getX() - c.getY() - c.getZ(),
            c -> - c.getX() + c.getY() + c.getZ(),
            c -> - c.getX() + c.getY() - c.getZ(),
            c -> - c.getX() - c.getY() + c.getZ(),
            c -> - c.getX() - c.getY() - c.getZ()
        };
        long ans = 0;
        for(Calculate calc : calcs) {
            list.sort((c1, c2) -> calc.calc(c1) > calc.calc(c2) ? 1 : -1);
            long x = 0, y = 0, z = 0;
            for(Cake c : list.subList(0, m)) {
                x += c.getX(); y += c.getY(); z += c.getZ();
            }
            ans = Math.max(ans, Math.abs(x) + Math.abs(y) + Math.abs(z));
        }
        System.out.println(ans);
    }
}

class Cake {
    long x, y, z;
    public Cake(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public long getX() { return x; }
    public long getY() { return y; }
    public long getZ() { return z; }
    public long getSum() { return x + y + z; }
}

@FunctionalInterface
interface Calculate {
    public long calc(Cake cake);
}