import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];

        if (n % 3 != 0) {
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(sc.next());
                if (a[i] != 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        } else {
            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(sc.next());
                if (hm.get(a[i]) == null) {
                    hm.put(a[i], 1);
                } else {
                    hm.put(a[i], hm.get(a[i]) + 1);
                }
            }

            if (hm.size() == 1) {
                if (hm.containsKey(0)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else if (hm.size() == 2) {
                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                    if (entry.getKey() == 0) {
                        if (entry.getValue() != n / 3) {
                            System.out.println("No");
                            return;
                        }
                    } else {
                        if (entry.getValue() != 2 * n / 3) {
                            System.out.println("No");
                            return;
                        }
                    }
                }
                System.out.println("Yes");
            } else if (hm.size() == 3) {
                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                    if (entry.getValue() != n / 3) {
                        System.out.println("No");
                        return;
                    }
                }
                int xor = 0;
                for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                    xor = xor ^ entry.getKey();
                }
                if (xor == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}