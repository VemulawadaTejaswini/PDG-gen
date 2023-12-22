import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = sc.next();

        int cntA=0, cntB=0, passed=0, rankB=0;
        for (char c : str.toCharArray()) {
            if (c == 'a') { cntA++; }
            if (c == 'b') { cntB++; }        
            if (c == 'c') {
                System.out.println("No");
                continue;
            }
            if (c == 'a') {
                if (passed < a+b) {
                    System.out.println("Yes");
                    passed++;
                } else {
                    System.out.println("No");
                }
            }
            if (c == 'b') {
                rankB++;
                if (passed < a+b && rankB <= b) {
                    System.out.println("Yes");
                    passed++;
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
