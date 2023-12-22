import lib.FastScanner;

public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        long k = fsc.nextLong();
        int x = fsc.nextInt();
        int y = fsc.nextInt();
        int rx = x >= 0 ? 1 : -1;
        int ry = y >= 0 ? 1 : -1;
        x *= rx;
        y *= ry;
        if (k % 2 == 0 && (x + y) % 2 != 0) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        long ts = (x + y - k - 1) / k;
        long tx = x / k;
        long bx = k * tx;
        for (int i = 1; i <= tx; i++) {
            sb.append(k * i * rx).append(' ').append(0).append('\n');
        }
        long ty = ts - tx;
        long by = k * ty;
        for (int i = 1; i <= ty; i++) {
            sb.append(bx * rx).append(' ').append(k * i * ry).append('\n');
        }
        long a = ts;
        x -= bx;
        y -= by;
        if (x + y == k) {
            a++;
            sb.append((bx + x) * rx).append(' ').append((by + y) * ry).append('\n');
        } else if (x + y > 0) {
            if (k % 2 == 1 && (x + y) % 2 == 1) {
                a++;
                if (x + y < k) {
                    sb.append(bx * rx).append(' ').append((by - k) * ry).append('\n');
                    by -= k;
                    y += k;
                } else {
                    sb.append((bx + x) * rx).append(' ').append((by + k - x) * ry).append('\n');
                    bx += x;
                    x = 0;
                    by += k - x;
                    y -= k - x;
                }
            }
            a += 2;
            for (int i = 0; i < 1 << 4; i++) {
                int s = (i & (1 << 0)) == 0 ? -1 : 1;
                int t = (i & (1 << 1)) == 0 ? -1 : 1;
                int u = (i & (1 << 2)) == 0 ? -1 : 1;
                int v = (i & (1 << 3)) == 0 ? -1 : 1;
                int inv = s * v - t * u;
                if (inv == 0) {
                    continue;
                }
                long x1 = -t * u * x - t * v * y + v * k + t * k;
                long y1 = +s * u * x + s * v * y - u * k - s * k;
                long x2 = +s * v * x + t * v * y - v * k - t * k;
                long y2 = -s * u * x - t * u * y + u * k + s * k;
                if (((x1 & 1) | (y1 & 1) | (x2 & 1) | (y2 & 1)) == 0) {
                    x1 /= inv;
                    y1 /= inv;
                    x2 /= inv;
                    y2 /= inv;
                    if (x1 * s >= 0 && y1 * t >= 0 && x2 * u >= 0 && y2 * v >= 0) {
                        sb.append((bx + x1) * rx).append(' ').append((by + y1) * ry).append('\n');
                        sb.append((bx + x1 + x2) * rx).append(' ').append((by + y1 + y2) * ry).append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(a);
        System.out.print(sb);
    }
}
