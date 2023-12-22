import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
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
        ABC116_D solver = new ABC116_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC116_D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long k = in.nextLong();


            Map<Long, ArrayList<Sushi>> typeMap = new HashMap<>();
            ArrayList<Sushi> allSushiList = new ArrayList<>();
            //寿司のネタ数
            long typeNum = 0;
            for (int i = 0; i < n; i++) {
                long t = in.nextLong();
                long d = in.nextLong();

                Sushi sushi = new Sushi(t, d);
                allSushiList.add(sushi);

                if (typeMap.containsKey(t)) {
                    typeMap.get(t).add(sushi);
                } else {
                    ArrayList<Sushi> dList = new ArrayList();
                    dList.add(sushi);
                    typeMap.put(t, dList);
                }
            }

            typeNum = typeMap.size();

            //typeMap降順ソート
            for (long key : typeMap.keySet()) {
                Collections.sort(typeMap.get(key), (a, b) -> (int) (b.d - a.d));
                // 先頭の要素を優先的に取るため、種類数が増えるフラグをTrueにする
                typeMap.get(key).get(0).isNewType = true;
            }

            // 全ての寿司のリストを降順にソート
            allSushiList.sort((a, b) -> (int) (b.d - a.d));


            ArrayList<Sushi> ateSushiList = new ArrayList<>();
            Map<Long, ArrayList<Long>> ateSushiMap = new HashMap<>();
            long point = 0;

            Iterator iterator = allSushiList.iterator();
            for (int i = 0; i < k; i++) {
                Sushi ateSushi = (Sushi) iterator.next();
                ateSushiList.add(ateSushi);
            }


            point = Math.max(point, calcPoint(ateSushiList));

            for (int i = (int) k; i < allSushiList.size(); i++) {
                Sushi ateSushi = allSushiList.get(i);

                if (ateSushi.isNewType) {
                    ateSushiList.add(ateSushi);

                    for (int j = ateSushiList.size() - 1; 0 <= j; j--) {
                        Sushi removeSushi = ateSushiList.get(j);
                        if (!removeSushi.isNewType) {
                            ateSushiList.remove(removeSushi);
                        }
                    }
                }

                point = Math.max(point, calcPoint(ateSushiList));
            }


            out.print(point);


        }

        private long calcPoint(ArrayList<Sushi> eatedSushiList) {
            long point = 0;
            long cntT = 0;
            for (Sushi sushi : eatedSushiList) {
                point += sushi.d;
                if (sushi.isNewType) {
                    cntT++;
                }
            }
            point += cntT * cntT;
            return point;
        }

    }

    static class Sushi {
        long t;
        long d;
        boolean isNewType;
        boolean eaten;

        Sushi(long t, long d) {
            this.t = t;
            this.d = d;
            this.isNewType = false;
            this.eaten = false;
        }

    }
}

