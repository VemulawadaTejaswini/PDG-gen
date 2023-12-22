import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();

            int[] nums = new int[4];
            for (int i = 0; i < 4; ++i) {
                nums[i] = s.charAt(i) - '0';
            }

            for (int i = 0; i < 2; ++i) {
                int tmp = nums[0];
                StringBuffer sb = new StringBuffer();
                sb.append("" + nums[0]);
                if (i == 0) {
                    tmp += nums[1];
                    sb.append("+");
                } else {
                    tmp -= nums[1];
                    sb.append("-");
                }
                sb.append("" + nums[1]);
                for (int j = 0; j < 2; ++j) {
                    if (j == 0) {
                        tmp += nums[2];
                        sb.append("+");
                    } else {
                        tmp -= nums[2];
                        sb.append("-");
                    }
                    sb.append("" + nums[2]);
                    for (int k = 0; k < 2; ++k) {
                        if (k == 0) {
                            tmp += nums[3];
                            sb.append("+");
                        } else {
                            tmp -= nums[3];
                            sb.append("-");
                        }
                        sb.append("" + nums[3]);
                        if (tmp == 7) {
                            out.println(sb.toString() + "=7");
                            return;
                        }
                        if (k == 0) {
                            tmp -= nums[3];
                        } else {
                            tmp += nums[3];
                        }
                        sb.deleteCharAt(sb.length() - 1);
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    if (j == 0) {
                        tmp -= nums[2];
                    } else {
                        tmp += nums[2];
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

    }
}

