


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public class comparator implements Comparator<program> {

        @Override
        public int compare(program p1, program p2) {
            if (p1.start < p2.start) {
                return -1;
            } else if (p1.start > p2.start) {
                return 1;
            } else {
                if (p1.end > p2.end) {
                    return 1;
                } else if (p1.end < p2.end) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public class comparator2 implements Comparator<recorder> {

        @Override
        public int compare(recorder r1, recorder r2) {
            if (r1.end < r2.end) {
                return -1;
            } else if (r1.end > r2.end) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public class program {
        public int start;
        public int end;
        public int channel;
        public program(int s, int e, int c) {
            start = s;
            end = e;
            channel = c;
        }
        public String toString() {
            return "[" + start + ", " + end + ") : " + channel;
        }
    }

    public class recorder {
        public int start;
        public int end;
        public recorder(int s, int e) {
            start = s;
            end = e;
        }
        public String toString() {
            return "[" + start + ", " + end + ")";
        }

    }
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        program[] p = new program[n];
        for (int i = 0; i < n; ++i) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            int channel = sc.nextInt();
            p[i] = new D.program(s, t, channel);
        }
        Arrays.sort(p, new comparator());
        int [] used = new int[n];
      //  for (int i = 0; i < n; ++i) {
     //       System.out.print(" " + p[i].toString());
     //   }
     //   System.out.println();
        PriorityQueue<recorder> priorityQueue = new PriorityQueue(n, new comparator2());
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (used[i] == 1) {
                continue;
            }
            int currentStart = p[i].start;
            int currentEnd = p[i].end;
            int channel = p[i].channel;
         //   System.out.println("currentStart: " + currentStart);
        //    System.out.println("currentEnd: " + currentEnd);
        //    System.out.println("channel: " + channel);

            if (!priorityQueue.isEmpty()) {
                recorder r = priorityQueue.peek();
           //     System.out.println("r: " + r.toString());
                if (r.end < currentStart) {
                    //can use
                    int newEnd = currentEnd;
                    int newStart = currentStart - 1;
                    int j = i;
                    used[j] = 1;
                    j = i + 1;
                    while (j < n && p[j].start == currentEnd) {
                        if (p[j].channel == channel) {
                            used[j] = 1;
                            newEnd = Math.max(newEnd, p[j].end);
                        }
                        ++j;
                    }
                    priorityQueue.poll();
           //         System.out.println("poll");
                    priorityQueue.add(new recorder(newStart, newEnd));
           //         System.out.println("push: [" + newStart + ", " + newEnd + ")");
                } else {
                    //cannot use
                    ++count;
           //         System.out.println("count: " + count);
                    int newStart = currentStart - 1;
                    int newEnd = currentEnd;
                    int j = i;
                    used[j] = 1;
                    j = i + 1;
                   // System.out.println("j: " + used[j] + " p[j].start: " + p[j].start);
                    while (j < n && p[j].start == currentEnd) {
                        if (p[j].channel == channel && used[j] == 0) {
                            used[j] = 1;
                            newEnd = Math.max(newEnd, p[j].end);
                        }
                        ++j;
                    }
           //         System.out.println("push: [" + newStart + ", " + newEnd + ")");
                    priorityQueue.add(new recorder(newStart, newEnd));
                }
            } else {
                //cannot use
                ++count;
           //     System.out.println("count: " + count);
                int newStart = currentStart - 1;
                int newEnd = currentEnd;
                int j = i;
                used[j] = 1;
                j = i + 1;
             //   System.out.println("p[j]: " + p[j].toString());
             //   System.out.println("j: " + used[j] + " p[j].start: " + p[j].start);
                while (j < n && p[j].start == currentEnd) {
                    if (p[j].channel == channel && used[j] == 0) {
                        used[j] = 1;
            //            System.out.println("newEnd: " + newEnd);
                        newEnd = Math.max(newEnd, p[j].end);
                    }
                    ++j;
                }
         //       System.out.println("push: [" + newStart + ", " + newEnd + ")");
                priorityQueue.add(new recorder(newStart, newEnd));
            }

        }
        System.out.println(count);
    }
    public static void main(String [] args) {
        D d = new D();
        d.solve();
    }
}
