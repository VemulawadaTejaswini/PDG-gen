import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int M = sc.nextInt();
 
        int p[] = new int[M];
        String S[] = new String[M];
 
        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
            S[i] = sc.next();
        }
 
        int ansAC = 0;
        int ansWA = 0;
 
        Set<Integer> list1 = new HashSet<Integer>();
 
        for (int i = 0; i < M; i++) {
            if (S[i].equals("AC")) {
                if (!(list1.contains(p[i]))) {
                    list1.add(p[i]);
                }
            }
        }
 
        for (int i = 0; i < M; i++) {
            if (list1.contains(p[i])) {
                if (S[i].equals("AC")) {
                    ansAC += 1;
                    list1.remove(list1.indexOf(p[i]));
                } else {
                    ansWA += 1;
                }
            }
 
        }
 
        System.out.println(ansAC + " " + ansWA);
 
    }
 
}