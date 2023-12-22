import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int c = in.nextInt();

            ArrayList<ArrayList<TaskD.Schedule>> channels = new ArrayList<ArrayList<TaskD.Schedule>>();
            for (int i = 0; i < c; i++) {
                channels.add(new ArrayList<TaskD.Schedule>());
            }

            for (int i = 0; i < n; i++) {
                int cs = in.nextInt();
                int ce = in.nextInt();
                int cc = in.nextInt() - 1;
                TaskD.Schedule sc = new TaskD.Schedule(cs, ce, cc);
                channels.get(cc).add(sc);
            }

            for (int i = 0; i < c; i++) {
                ArrayList<TaskD.Schedule> cc = channels.get(i);
                Comparator<TaskD.Schedule> endTimeComparator = Comparator.comparing(TaskD.Schedule::getEnd);
                cc.sort(endTimeComparator);
            }
            for (int i = 0; i < c; i++) {
                ArrayList<TaskD.Schedule> cc = channels.get(i);
                for (int j = cc.size() - 1; j > 0; j--) {
                    TaskD.Schedule s1 = cc.get(j - 1);
                    TaskD.Schedule s2 = cc.get(j);
                    if (s1.getEnd() == s2.getStart()) {
                        TaskD.Schedule ns = new TaskD.Schedule(s1.getStart(), s2.getEnd(), s1.getChannel());
                        cc.remove(s1);
                        cc.remove(s2);
                        cc.add(ns);
                    }
                }
            }

            ArrayList<TaskD.Schedule> all = new ArrayList<TaskD.Schedule>();
            for (int i = 0; i < c; i++) {
                ArrayList<TaskD.Schedule> cc = channels.get(i);
                all.addAll(cc);
            }

            Comparator<TaskD.Schedule> endTimeComparator = Comparator.comparing(TaskD.Schedule::getEnd);
            all.sort(endTimeComparator);

            int ans = 0;
            while (all.size() > 0) {
                int endTime = all.get(0).getEnd();
                all.remove(0);

                ArrayList<TaskD.Schedule> delList = new ArrayList<TaskD.Schedule>();
                for (int i = 0; i < all.size(); i++) {
                    TaskD.Schedule cs = all.get(i);
                    if (cs.getStart() > endTime) {
                        endTime = cs.getEnd();

                        delList.add(cs);
                    }
                }
                for (TaskD.Schedule cs : delList) {
                    all.remove(cs);
                }
                ans++;
            }
            out.println(ans);
        }

        static class Schedule {
            private int start;
            private int end;
            private int channel;

            Schedule(int start, int end, int channel) {
                this.start = start;
                this.end = end;
                this.channel = channel;
            }

            public int getChannel() {
                return this.channel;
            }

            public int getEnd() {
                return this.end;
            }

            public int getStart() {
                return this.start;
            }

        }

    }
}

