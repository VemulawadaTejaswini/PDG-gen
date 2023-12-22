import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0;i < n;++i){
            p[i] = sc.nextInt();
        }
        int connects[] = new int[n + 1];
        int equals[][] = new int[n + 1][n];
        int c = 1;
        for (int i = 0;i < m;++i){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(connects[x] == 0&&connects[y] == 0){
                connects[x] = c;
                connects[y] = c;
                ++c;
            }
            else if(connects[x] == 0){
                connects[x] = connects[y];
            }
            else if(connects[y] == 0){
                connects[y] = connects[x];
            }
            else{
                int q = connects[y];
                int r = connects[x];
                for (int j = 0;j < n;++j){
                    if(equals[q][j] == 0){
                        equals[q][j] = r;
                        break;
                    }
                }
                for (int j = 0;j < n;++j){
                    if(equals[r][j] == 0){
                        equals[r][j] = q;
                        break;
                    }
                }
            }
        }
        int total = 0;
        for (int i = 1;i <= n;++i){
            if(connects[i] == -1)continue;
            int q = connects[i];
            connects[i] = -1;
            ArrayList<Integer> con = new ArrayList<>();
            con.add(i);
            for (int j = i + 1;j <= n;++j){
                if(connects[j] == q){
                    con.add(j);
                    connects[j] = -1;
                }
                for (int tt:equals[q]){
                    if(tt == 0)continue;
                    if(connects[j] == tt){
                        con.add(j);
                        connects[j] = -1;
                    }
                }
            }

            int er = 0;
            for (int j = 0;j < con.size();++j){
                for (int k:con){
                    if(p[con.get(j) - 1] == k){
                        ++total;
                    }
                }
            }
        }
        System.out.println(total);
    }







}