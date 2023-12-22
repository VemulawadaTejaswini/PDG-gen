import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++) s[i] = sc.next();
        int[][] map = new int[n][26];
        for(int i=0;i<n;i++){
            String cur = s[i];
            for(int j=0;j<cur.length();j++){
                map[i][cur.charAt(j)-'a']++;
            }
        }
        int[] res = new int[26];
        for(int i=0;i<26;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++) min = Math.min(min,map[j][i]);
            res[i]=min;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            char cur = (char)(i+'a');
            for(int j=0;j<res[i];j++) sb.append(cur);
        }
        System.out.println(sb.toString());
    }
}

