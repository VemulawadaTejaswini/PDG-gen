import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] card = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        boolean[][] called = {{false,false,false},{false,false,false},{false,false,false}};
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                card[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        int n = Integer.parseInt(sc.next());
        
        int b = 0;
        for(int t = 0; t < n; t++) {
            b = Integer.parseInt(sc.next());
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(card[i][j] == b) {
                        called[i][j] = true;
                    }
                }
            }
        }
        
        boolean ans = false;
        for(int i = 0; i < 3; i++) {
            if((called[i][0])&&(called[i][1])&&(called[i][2])) {
                ans = true;
            }
            if((called[0][i])&&(called[1][i])&&(called[2][i])) {
                ans = true;
            }
        }
        if((called[0][0])&&(called[1][1])&&(called[2][2])) {
            ans = true;
        }
        if((called[0][2])&&(called[1][1])&&(called[2][0])) {
            ans = true;
        }
        
        if(ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}