import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k==0) {
            System.out.println(0);
            return;
        }
        if (k==1) {
            System.out.println(n);
            return;
        }
        if (k>n) {
            System.out.println(0);
            return;
        }
        int max = n/k;
//        System.out.println("Max="+max);
        String pi[]= new String[n];

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

                if (pi[i].toLowerCase().charAt(0) == pi[j].toLowerCase().charAt(0) && !"-".equals(pi[i])) {
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