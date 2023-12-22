import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        int[] friendsCount = new int[n+1];
        for(int i=0; i<m; i++) {
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            a[i] = Math.min(a1, b1);
            b[i] = Math.max(a1, b1);
            friendsCount[a1]++;
            friendsCount[b1]++;
        }
        int[] c = new int[k];
        int[] d = new int[k];
        for(int i=0; i<k; i++) {
            int c1 = in.nextInt();
            int d1 = in.nextInt();
            c[i] = Math.min(c1, d1);
            d[i] = Math.max(c1, d1);
        }

        // グループ分け
        int[] group = new int[n+1];
        for(int i=1; i<=n; i++) {
            group[i] = 0;
        }
        int nextG = 1;
        for(int i=0; i<m; i++) {
            int ga = group[a[i]];
            int gb = group[b[i]];
            if(ga==gb && ga!=0) {
                // 既に同じグループ。制約に反してる気がするが無視
            }
            else if(ga!=0 && gb!=0) {
                // union : gaに揃える
                for(int j=1; j<=n; j++) {
                    if(group[j] == gb) {
                        group[j] = ga;
                    }
                }
            }
            else if(ga==0 && gb!=0) {
                group[a[i]] = gb;
            }
            else if(ga!=0 && gb==0) {
                group[b[i]] = ga;
            }
            else {
                // 新規
                group[a[i]] = nextG;
                group[b[i]] = nextG;
                nextG++;
            }
        }
        // 各グループの人数
        int[] groupMemberCount = new int[nextG];
        for(int i=1; i<=n; i++) {
            groupMemberCount[group[i]]++;
        }

        // 同グループの人をブロックしている数
        int[] blockCount = new int[n+1];
        for(int i=0; i<k; i++) {
            if(group[c[i]] == group[d[i]]) {
                blockCount[c[i]]++;
                blockCount[d[i]]++;
            }
        }

        // 答え
        for(int i=1; i<=n; i++) {
            int result = groupMemberCount[group[i]] - friendsCount[i] - blockCount[i] - 1;
            System.out.print(result);
            if(i<n) {
                System.out.print(' ');
            }
            else {
                System.out.println();
            }
        }
    }
}
