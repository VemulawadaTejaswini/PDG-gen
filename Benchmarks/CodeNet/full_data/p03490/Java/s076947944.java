import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        ArrayList h = new ArrayList<Integer>();
        ArrayList w = new ArrayList<Integer>();

        char pc = 'F';
        int cont = 0;
        boolean dir = true;        // t:x, f:y
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'F'){
                if(pc == 'F'){
                    cont++;
                }else{
                    if(cont%2 != 0) dir = !dir;
                    cont = 1;
                    pc = 'F';
                }
            }else{
                if(pc == 'F'){
                    if(dir){
                        h.add(cont);
                    }else{
                        w.add(cont);
                    }
                    cont = 1;
                    pc = 'T';
                }else{
                    cont++;
                }
            }
        }
        if(pc == 'F'){
            if(dir){
                h.add(cont);
            }else{
                w.add(cont);
            }
        }

        if(canReach(Math.abs(x), h) && canReach(Math.abs(y), w)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean canReach(int len, ArrayList<Integer> move){
        int sum = 0;
        for (int oneMove : move) {
            sum += oneMove;
        }
        if((sum-len) % 2 != 0) return false;
        int target = (sum - len) / 2;
        boolean[][] dp = new boolean[move.size()+1][target+1];
        for(int i=0; i<target+1; i++){
            for(int j=0; j<move.size()+1; j++){
                dp[j][i] = i == 0 ? true : false;
            }
        }
        for(int i=0; i<move.size(); i++){
            for(int j=0; j<target+1; j++){
                if(j >= move.get(i)){
                    if(dp[i][j] || dp[i][j-move.get(i)]) dp[i+1][j] = true;
                }else{
                    dp[i+1][j] = dp[i][j];
                }
            }
        }
        return dp[move.size()][target];
    }
}