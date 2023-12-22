import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        int[][] S = new int[n][28];
        String ans = "";
        for(int i = 0;i < n;i++){
            String s = sc.next();
            for(int j = 0;j < s.length();j++){
                int id = s.charAt(j)-'a';
                S[i][id]++;
            }
        }
        for(int w = 0;w < 28;w++){
            int min = 100;
            for(int h = 0;h < n;h++){
                min = Math.min(min, S[h][w]);
            }
            for(int i = 0;i < min;i++)  ans = ans + (char)(w+'a');
        }
        System.out.println(ans);
    }
}