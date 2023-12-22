import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();

            // main.solveA(sc);
            // main.solveB(sc);
            main.solveC(sc);
            // main.solveE(sc);

        }
    }

    private void solveE(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); PrintWriter pw = new PrintWriter(System.out)) {
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int q = Integer.parseInt(line[1]);
            long[] nums = new long[q];
            for (int i = 0; i < q; i++) {
                nums[i] = Long.parseLong(br.readLine());
            }

            long min = LongStream.of(nums).min().getAsLong();
            long last = nums[q - 1];
            for (int i = 0; i < n; i++) {
                if (i >= min) {
                    pw.write("0\r\n");
                    continue;
                }
                long count = last / min;
                if (last % min > i) {
                    count++;
                }
                pw.write(count + "\r\n");
            }

            pw.flush();

        } catch (IOException e) {

        }
    }

    class Pos {
        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        int num;
        int index;

        Pos(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }

    private void solveC(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            List<Pos> nums = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                nums.add(new Pos(Integer.parseInt(br.readLine()), i));
            }
            List<Pos> sortedList = nums.stream().sorted((o1, o2) -> o1.getNum() - o2.getNum()).collect(Collectors.toList());

            int otherRangeCounts = 0;
            for (int i = 0; i < n; i++) {
                Pos pos = sortedList.get(i);
                int index = i;
                int num = pos.getIndex();
                if (num % 2 != index % 2) {
                    otherRangeCounts++;
                }
            }
            System.out.println(otherRangeCounts / 2);

        } catch (IOException e) {

        }
    }

    void solveB(Scanner sc) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            long sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += (nums[i] / 2);
                if (nums[i] % 2 > 0 && nums[i + 1] > 0) {
                    sum++;
                    nums[i + 1]--;
                }
            }

            sum += (nums[n - 1] / 2);

            System.out.println(sum);

        } catch (IOException e) {

        }

    }

    void solveA(Scanner sc) {
        String s = sc.next();
        if (s.indexOf("N") >= 0 && s.indexOf("S") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("S") >= 0 && s.indexOf("N") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("W") >= 0 && s.indexOf("E") < 0) {
            System.out.println("No");
            return;
        }
        if (s.indexOf("E") >= 0 && s.indexOf("W") < 0) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }

}
