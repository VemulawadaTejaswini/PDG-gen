import java.util.Scanner;

public class Main {

    static int n, a, b, c;
    static int[] L;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        L = new int[n];
        for (int i = 0; i < n; i++) L[i] = sc.nextInt();
        int[] op = new int[n];
        dfs(0, op);

        System.out.println(ans);
        sc.close();
    }

    static public void dfs(int idx, int[] op){
        if(idx < n-1){
            for (int i = 0; i < 4; i++) {
                int[] op2 = new int[n];
                for (int j = 0; j < idx; j++) op2[j] = op[j];
                op2[idx] = i;
                dfs(idx+1, op2);
            }
        }else{
            for (int i = 0; i < 4; i++) {
                op[idx] = i;
                int[][] len = new int[3][2]; // {a,b,c}{len, cnt}
                for (int j = 0; j < n; j++) {
                    if(op[j] == 1){
                        len[0][0] += L[j];
                        len[0][1]++;
                    }else if(op[j] == 2){
                        len[1][0] += L[j];
                        len[1][1]++;
                    }else if(op[j] == 3){
                        len[2][0] += L[j];
                        len[2][1]++;
                    }
                }
                if(len[0][1] != 0 && len[1][1] != 0 && len[2][1] != 0){
                    ans = Math.min(ans, Math.abs(a - len[0][0])
                                                      + Math.abs(b - len[1][0])
                                                      + Math.abs(c - len[2][0])
                                                      + 10 *(len[0][1] + len[1][1] + len[2][1] -3));
                }
            }
        }
    }
}
