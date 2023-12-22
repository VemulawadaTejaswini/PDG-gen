
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// *** at 2018/**/**

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solveA();
    }

    private void solveA() {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String A = "qwertyuiopasdfghjklzxcvbnm";
        List<String> sList = new ArrayList<>(Arrays.asList(S.split("")));
        List<String> aList = new ArrayList<>(Arrays.asList(A.split("")));
        Collections.sort(aList);
        if (S.length() == 26) {
            if (S.equals(A) || S.endsWith("a")) {
                System.out.println(-1);
                return;
            }
            for (int i = 0; i < sList.size(); i++) {
                if (!sList.get(i).equals(aList.get(i))) {
                    String res = "";
                    for (int j = 0; j < i - 1; j++) {
                        res += aList.get(j);
                    }
                    System.out.println(res + aList.get(i));
                    return;
                }
            }
        } else {
            for (String c : sList) {
                if (aList.contains(c)) {
                    aList.remove(c);
                }
            }
            System.out.println(S + aList.get(0));
        }
    }

    private void solveB() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveC() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveD() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveE() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

    private void solveF() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }

}