import java.util.*;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> abcList = new ArrayList<>();
        abcList.add(a);
        abcList.add(b);
        abcList.add(c);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int magic = 0;

        while (!abcList.isEmpty()) {
            int abc = 0;
            int pos = 0;
            int diff = Math.abs(abcList.get(0) - list.get(0));
            for (int i = 0; i < abcList.size(); i++) {
                for (int j = 1; j < list.size(); j++) {
                    int tempDiff = Math.abs(abcList.get(i) - list.get(j));
                    if (tempDiff < diff) {
                        diff = tempDiff;
                        pos = j;
                        abc = i;
                    }
                }
                if (diff == 0) {
                    list.remove(pos);
                    abcList.remove(abc);
                    continue;
                }
            }

            if (abcList.isEmpty()) System.out.println(magic);

            if (diff <= 10 && diff !=0) {
                magic += diff;
                list.remove(pos);
                abcList.remove(abc);
            } else {
                Collections.sort(list, Comparator.reverseOrder());
                if (list.size() > 1) {
                    for (int j = 0; j < list.size() - 1; j++) {
                        if (list.get(j) + list.get(j + 1) > abcList.get(abc)) {
                            continue;
                        } else if (list.get(j) + list.get(j + 1) == abcList.get(abc)) {
                            magic += 10;
                            list.remove(j + 1);
                            list.remove(j);
                            abcList.remove(abc);
                        } else {
                            list.add(list.get(j) + list.get(j + 1));
                        }
                    }
                } else {
                    magic += diff;
                    System.out.println(magic);
                    return;
                }
            }
        }

        System.out.println(magic);
        }
    }