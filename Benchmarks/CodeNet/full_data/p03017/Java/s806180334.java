import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '#')
                set.add(i + 1);
        }

        boolean res = true;
        while (true) {
            int comp = 2;
            if (set.contains(b + 1) && set.contains(b + 2)) {
                res = false;
                break;
            }
            if (d < b) {
                res = false;
                break;
            } else if (b == d) {
                break;
            }

            if (set.contains(b + 2) || d - b == 1) {
                comp = 1;
            }

            b += comp;
        }

        if (!res) {
            System.out.println("No");
            return;
        }

//        set.add(d);
        while (true) {
            int comp = 2;
            if (set.contains(a + 1) && set.contains(a + 2)) {
                res = false;
                break;
            }
            if (c < a) {
                res = false;
                break;
            } else if (a == c) {
                break;
            }

            if (set.contains(a + 2) || c - a == 1) {
                comp = 1;
            }

            a += comp;
        }


        System.out.println(res ? "Yes" : "No");
    }


    //    public static boolean search(int aposi, int bposi, int adist, int bdist, Set<Integer> iwa) {
    //        if (iwa.contains(aposi) || aposi == bposi || adist < aposi) {
    //            return false;
    //        }
    //        if (iwa.contains(bposi) || aposi == bposi || bdist < bposi) {
    //            return false;
    //        }
    //        if (aposi == adist && bposi == bdist) {
    //            return true;
    //        }
    //        boolean a1 = search(aposi+1, bposi, adist, bdist, iwa);
    //        boolean a2 = search(aposi+2, bposi, adist, bdist, iwa);
    //        boolean b1 = search(aposi, bposi+1, adist, bdist, iwa);
    //        boolean b2 = search(aposi, bposi+2, adist, bdist, iwa);
    //
    //        return a1 || a2 || b1 || b2 ? true : false;
    //    }
}