import java.util.Scanner;

class Main {
    private static StringBuilder ans;
    private static int ops = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ans = new StringBuilder();
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) a[i] = scanner.nextInt();
        int[] endPoints = new int[]{0, a.length};
        while (endPoints.length > 0){
            endPoints = findAndResolve(a, endPoints[0], endPoints[1]);
        }
        System.out.println(ops);
        if (ans.length() > 1)ans.deleteCharAt(ans.length() - 1);
        System.out.println(ans.toString());
    }

    private static int[] findAndResolve(long[] a, int from, int upto){
        if (from == upto || upto < from) return new int[]{};
        int maxIndex = 0;
        long maxAbs = 0;
        long max = 0;

        for (int i = from; i < upto; i++) {
            if (Math.abs(a[i]) > maxAbs){
                maxIndex = i;
                max = a[i];
                maxAbs = Math.abs(a[i]);
            }
        }

        if (max > 0){
            for (int i = maxIndex; i < a.length; i++) {
                if (a[i] < max){
                    a[i] += max;
                    ops ++;
                    ans.append(maxIndex + 1).append(" ").append(i + 1).append("\n");
                    if (a[i] < max){
                        a[i] += max;
                        ops++;
                        ans.append(maxIndex + 1).append(" ").append(i + 1).append("\n");
                    }
                }
            }
            return new int[]{from, maxIndex};
        }
        else if(max < 0){
            for (int i = maxIndex; i >= 0; i--) {
                if (a[i] > max){
                    a[i] += max;
                    ops++;
                    ans.append(maxIndex + 1).append(" ").append(i + 1).append("\n");
                    if (a[i] > max){
                        a[i] += max;
                        ops++;
                        ans.append(maxIndex + 1).append(" ").append(i + 1).append("\n");
                    }
                }
            }
            return new int[]{maxIndex + 1, upto};
        }

        return new int[]{};
    }
}
