import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int n = Integer.parseInt(br.readLine());
            String aStr[] = br.readLine().split(" ");
            ArrayList<Integer> aList = new ArrayList<Integer>();
            for (int i = 0; i < aStr.length; i++) {
                aList.add(Integer.parseInt(aStr[i]));
            }
            while (true) {
                ArrayList<Integer> k = new ArrayList<Integer>();
                ArrayList<Integer> g = new ArrayList<Integer>();
                boolean flag = false;
                int delIndex1 = 0;
                int delIndex2 = 0;
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    int tmp = aList.get(i);
                    if (tmp % 2 == 0) {
                        g.add(i);
                        if (g.size() >= 2) {
                            sum = aList.get(g.get(0)) + aList.get(g.get(1));
                            delIndex1 = g.get(0);
                            delIndex2 = g.get(1);
                            flag = true;
                            break;
                        }
                    } else {
                        k.add(i);
                        if (k.size() >= 2) {
                            sum = aList.get(k.get(0)) + aList.get(k.get(1));
                            delIndex1 = k.get(0);
                            delIndex2 = k.get(1);
                            flag = true;
                            break;
                        }
                    }
                }
                if (!flag) {
                    if (aList.size() == 1) {
                        System.out.println("YES");
                    } else if (aList.size() == 2) {
                        System.out.println("NO");
                    }
                    break;
                } else {
                    Iterator<Integer> iter = aList.iterator();
                    int index = 0;
                    while (iter.hasNext()) {
                        int tmp = iter.next();
                        if (index == delIndex1 || index == delIndex2) {
                            iter.remove();
                        }
                        index++;
                    }
                    aList.add(sum);
                }
                n = aList.size();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}