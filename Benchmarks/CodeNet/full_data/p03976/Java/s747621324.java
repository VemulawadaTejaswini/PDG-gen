import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = n/k;
//        System.out.println("Max="+max);
        String pi[]= new String[n];
        String tmp;
        for (int i=0; i<n; i++) {
            pi[i] = sc.next();
        }
        int usable = n;
        for (int i=0; i<n; i++) {
            int count = 1;
            if ("-".equals(pi[i])) {
                continue;
            }
            for (int j=i+1; j<n; j++) {
//                if (pi[j].compareToIgnoreCase(pi[j+1]) > 0) {

                if (pi[i].charAt(0) == pi[j].charAt(0)) {
                    count++;
                    pi[j] = "-";
                }
                if (count > max) {
                    usable--;
                }
            }
            pi[i] = "-";
        }

//                System.out.println(usable);
        int ans = (int) usable/k;
        System.out.println(ans);
    }
}