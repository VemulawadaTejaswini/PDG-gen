import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] t = sc.next().toCharArray();
        sc.close();
        char[] tmp = (s+s).toCharArray();
        int[][] index = new int[26][n];
        for(int i=0;i<26;i++){
            index[i][n-1] = -1;
        }
        for(int i= n*2-1;i>=n-1;i--){
            index[tmp[i]-'a'][n-1] = i;
        }
        int ii;
        for(int i=n-2;i>=0;i--){
            ii = tmp[i]-'a';
            for(int j=0;j<26;j++){
                if(ii==j){
                    index[ii][i] = i;
                }else{
                    index[j][i] = index[j][i+1];
                }
            }
        }
        long ans = 0;
        int prev = 0;
        for(int i=0;i<t.length;i++){
            ii = t[i]-'a';
            if(index[ii][prev]==-1){
                System.out.println(-1);
            }else{
                ans += index[ii][prev]-prev+1;
                prev = (index[ii][prev]+1)%n;
            }

        }
        System.out.println(ans);


    }
}