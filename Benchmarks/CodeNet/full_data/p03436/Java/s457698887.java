import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

    private static Scanner sc;
    private static int[][] neg8 = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    private static int[][] neg4 = new int[][]{{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int H = sc.nextInt();
            int W = sc.nextInt();

            char[][] arr = new char[H][W];
            int cntW = 0;
            for (int i = 0; i <H ; i++) {
                arr[i]= sc.next().toCharArray();
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == '.') cntW++;
                }
            }

            int[][] counter = new int[H][W];
            ArrayDeque<Point> q = new ArrayDeque<>();
            Point start = new Point(0,0);
            Point goal = new Point(W-1,H-1);
            q.offer(start);

            while (q.size() > 0) {

                Point poll = q.poll();
                if (poll.equals(goal)) {
                    break;
                }

                for (int[] ints : neg4) {
                    try {
                        int nY = ints[0] + poll.y;
                        int nX = ints[1] + poll.x;

                        if (counter[nY][nX] != 0) continue;
                        if (arr[nY][nX] == '#') continue;

                        counter[nY][nX] = counter[poll.y][poll.x] + 1;
                        q.offer(new Point(nX, nY));

                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }

            int i = counter[goal.y][goal.x];
            if (i==0) {
                System.out.println(-1);
                return;
            }

            int ans = cntW - (i+1);
            System.out.println(ans);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }

    private static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
    }

    private static boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        boolean swap = false;
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
            swap = true;
        }
        reverse(nums, i + 1);
        return swap;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

