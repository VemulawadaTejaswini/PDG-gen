import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int count = 0;
        for (int i = 0; i < n; i++) {

            char si = s.charAt(i);

            for (int j = i+1; j < n; j++) {

                char sj = s.charAt(j);
                if (si == sj) {
                    continue;
                }

                for (int k = j+1; k < n; k++) {
                    if (j - i == k - j) {
                        continue;
                    }
                    
                    char sk = s.charAt(k);
                    if (si == sk || sj == sk) {
                        continue;
                    }
                    //System.out.println(i + " " + j + " " + k);
                  //System.out.println(si + " " + sj + " " + sk);
                  count++;
                }
            }

        }

        System.out.println(count);
    }
}
