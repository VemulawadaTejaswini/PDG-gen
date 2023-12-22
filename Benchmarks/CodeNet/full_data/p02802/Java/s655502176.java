import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int countAc = 0;
        int tmpCountWa = 0;
        int countWa = 0;
        
        int currentPn = 0;
        int previousPn = 0;
        for (int i = 0; i < m; i++) {
            int pn = sc.nextInt();
            String s = sc.next();

            if (previousPn == pn) {
                continue;
            } 

            if (currentPn != pn) {
                previousPn = currentPn;
                currentPn = pn;
                tmpCountWa = 0;
                continue;
            }
            
            if (s.equals("WA")) {
                tmpCountWa++;
            } else {
                countAc++;
                countWa += tmpCountWa;
                previousPn = currentPn;
                currentPn = pn;
                tmpCountWa = 0;
            }
        }
  

        System.out.println(countAc + " " + countWa);
    }
}
