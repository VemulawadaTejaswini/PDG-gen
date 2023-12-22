import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        List<Cake> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            list.add(new Cake(in.nextLong(), in.nextLong(), in.nextLong()));
        }
        long ans = 0;
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getX));
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
        }
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getX).reversed());
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
        }
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getY));
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
        }
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getY).reversed());
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
        }
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getZ));
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
        }
        {
            Collections.sort(list, Comparator.comparingLong(Cake::getZ).reversed());
            Sum[][] dp = new Sum[m+1][n+1];
            Arrays.fill(dp[0], new Sum(0, 0, 0));
            for(int i = 1; i <= m; i++) {
                dp[i][0] = new Sum(0, 0, 0);
            }
            for(int k = 1; k <= m; k++) {
                for(int i = 1; i <= n; i++) {
                        Sum tmp = dp[k-1][i-1];
                        Sum sum = new Sum(tmp.x + list.get(i - 1).getX(), tmp.y + list.get(i - 1).getY(), tmp.z + list.get(i - 1).getZ());
                        Sum bigger = sum.sum() > dp[k][i-1].sum() ? sum : dp[k][i-1];
                        if(dp[k][i] == null || dp[k][i].sum() < bigger.sum()) {
                            dp[k][i] = bigger;
                        }
                    }
                }
            ans = Math.max(ans, dp[m][n].sum());
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

    public long getX() { return this.x; }
    public long getY() { return this.y; }
    public long getZ() { return this.z; }
}

class Sum {
    long x, y, z;
    public Sum(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public long sum() {
        return Math.abs(x) + Math.abs(y) + Math.abs(z);
    }

    public String toString() {
        return String.format("(%d, %d, %d)", x, y, z);
    }
}