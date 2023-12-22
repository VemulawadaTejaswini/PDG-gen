import java.util.*;
class Abc
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        int m = t.length();
        String[][] x = new String[n][m];
        if(s.charAt(0) == t.charAt(0)) x[0][0] = "" + s.charAt(0);
        else x[0][0] = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0) continue;
                else if(i == 0){
                    if(x[i][j-1]  != "") x[i][j] = x[i][j-1];
                    else if(s.charAt(i) == t.charAt(j)) x[i][j] = "" + s.charAt(i);
                    else x[i][j] = "";
                }
                else if(j == 0){
                    if(x[i-1][j] != "") x[i][j] = x[i-1][j];
                    else if(s.charAt(i) == t.charAt(j)) x[i][j] = x[i-1][j] + s.charAt(i);
                    else x[i][j] = "";
                }
                else{
                    String p = "", q = (x[i][j-1].length() < x[i-1][j].length()) ? x[i-1][j] : x[i][j-1];
                    if(s.charAt(i) == t.charAt(j)) p = x[i-1][j-1] + s.charAt(i);
                    x[i][j] = (p.length() > q.length()) ? p : q;
                }
                
            }
        }
        String ans = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(ans.length() < x[i][j].length()){
                    ans = x[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}