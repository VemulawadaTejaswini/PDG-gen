import java.util.*;

public class Main {
    private class Node {
        int src, dst;
        boolean isfix = false;

        public void set(int src, int dst) {
            this.src = Math.max(src, 1);
            this.dst = Math.max(dst, 1);
        }

        public void merge(int tsrc, int tdst) {
            tsrc = Math.max(tsrc, 1);
            tdst = Math.max(tdst, 1);

            if (src <= dst) {
                if (tsrc <= tdst) {
                    src = Math.max(src, tsrc);
                    dst = Math.min(dst, tdst);
                } else {
                    if ((src + tsrc) % 2 == 0) {
                        int tmp = (src + tsrc) / 2;
                        if (tmp <= dst && tmp >= tdst) {
                            src = tmp;
                            dst = tmp;
                        } else {
                            src = 0;
                            dst = 0;
                        }
                    } else {
                        src = 0;
                        dst = 0;
                    }
                }
            } else {
                if (tsrc >= tdst) {
                    src = Math.min(src, tsrc);
                    dst = Math.max(dst, tdst);
                } else {
                    if ((src + tsrc) % 2 == 0) {
                        int tmp = (src + tsrc) / 2;
                        if (tmp <= tdst && tmp >= dst) {
                            src = tmp;
                            dst = tmp;
                        } else {
                            src = 0;
                            dst = 0;
                        }
                    } else {
                        src = 0;
                        dst = 0;
                    }
                }
            }
        }

        private int len() {
            if (Math.max(src, dst) <= 0) {
                return 0;
            }

            return Math.abs(Math.max(dst, 1) - Math.max(src, 1)) + 1;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        Node nodes[] = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int u = sc.nextInt();
            int s = sc.nextInt();
            if (!nodes[v - 1].isfix) {
                if (!nodes[u - 1].isfix) {
                    nodes[v - 1].set(1, s - 1);
                    nodes[u - 1].set(s - 1, 1);
                    nodes[v - 1].isfix = true;
                    nodes[u - 1].isfix = true;
                } else {
                    nodes[v - 1].set(s - nodes[u - 1].src, s - nodes[u - 1].dst);
                    nodes[v - 1].isfix = true;
                }
            } else {
                if (!nodes[u - 1].isfix) {
                    nodes[u - 1].set(s - nodes[v - 1].src, s - nodes[v - 1].dst);
                    nodes[u - 1].isfix = true;
                } else {
                    nodes[u - 1].merge(s - nodes[v - 1].src, s - nodes[v - 1].dst);
                }
            }
        }

        Arrays.sort(nodes, (o1, o2) -> o1.len() - o2.len());
        System.out.println(nodes[0].len());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
