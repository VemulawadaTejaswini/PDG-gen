
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; ++i) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            solve(a, b, c, d);
        }
    }
    public static int withinCube(long a, long c) {
        if (!(a >= 3 && c >= 3)) {
            if (a == c) {
                return 0;
            } else {
                return -1;
            }
        }
        int indexA = 0;
        long tmpA = a - 1;
        while (tmpA >= 3) {
            tmpA /= 3;
            indexA++;
        }
        int indexC = 0;
        long tmpC = c - 1;
        while (tmpC >= 3) {
            tmpC /= 3;
            indexC++;
        }
//        System.out.println(
//                "a: " + a + " c: " + c +
//                " indexA: " + indexA + " indexC: " + indexC);
        if (indexA == indexC) {
            return indexA;
        } else {
            return -1;
        }
    }
    public static long pow(long a, long exp) {
        long res = 1;
        for (int i = 0; i < exp; ++i) {
            res *= a;
        }
        return res;
    }
    public static void solve(long a, long b, long c, long d) {
        final int withinCubeAC = withinCube(a, c);
        final int withinCubeBD = withinCube(b, d);
        if (withinCubeAC == -1 && withinCubeBD == -1) {
            long ans = Math.abs(a - c) + Math.abs(b - d);
            System.out.println(ans);
            return;
        } else if (withinCubeAC > 0) {
            long cubeLength = pow(3, withinCubeAC);
            if ((a - 1) / cubeLength % 3 == 1 && (c - 1) / cubeLength % 3 == 1 && Math.abs((b - 1) / cubeLength - (d - 1) / cubeLength) > 1) {
//                System.out.println("withinCubeAC: " + withinCubeAC);
//                System.out.println("cubeLength: " + cubeLength);
                if (a > c) {
                    long tmp = c;
                    c = a;
                    a = tmp;
                }
                long x1 = a % cubeLength - 1;
                long x2 =
                        c % cubeLength == 0
                                ? cubeLength - 1
                                : c % cubeLength - 1;
//                System.out.println("x1: " + x1);
//                System.out.println("x2: " + x2);
                long path1 = x1 + x2;
                long path2 = (cubeLength - x1 - 1) + (cubeLength - x2 - 1);
                long ans = Math.min(path1, path2) + Math.abs(b - d) + 2;
//                System.out.println("path1: " + path1);
//                System.out.println("path2: " + path2);
                System.out.println(ans);
            } else {
                long ans = Math.abs(a - c) + Math.abs(b - d);
                System.out.println(ans);
            }
        }
        else if (withinCubeBD > 0) {
            long cubeLength = pow(3, withinCubeBD);
//            System.out.println("withinCubeBD: " + withinCubeBD);
//            System.out.println("cubeLength: " + cubeLength);
//            System.out.println("a / cubeLength: " + a / cubeLength);
//            System.out.println(" c / cubeLength: " + c / cubeLength);
            if ((b - 1) / cubeLength % 3 == 1 && (d - 1) / cubeLength % 3 == 1 && Math.abs((a - 1) / cubeLength - (c - 1) / cubeLength) > 1) {
                if (b > d) {
                    long tmp = b;
                    b = d;
                    d = tmp;
                }
                long x1 = b % cubeLength - 1;
                long x2 =
                        d % cubeLength == 0
                                ? cubeLength - 1
                                : d % cubeLength - 1;
                long path1 = x1 + x2 + Math.abs(b - d);
                long path2 = (cubeLength - x1 - 1) + (cubeLength - x2 - 1) + Math.abs(b - d);
                long ans = Math.min(path1, path2) + Math.abs(a - c) + 2;
                System.out.println(ans);
            } else {
                long ans = Math.abs(a - c) + Math.abs(b - d);
                System.out.println(ans);

            }
        } else {
            long ans = Math.abs(a - c) + Math.abs(b - d);
            System.out.println(ans);
        }
    }
}
