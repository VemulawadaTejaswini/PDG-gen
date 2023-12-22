import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] s = new String[n];
      for(int i = 0;i < n;i++) s[i]=sc.next();
      int[][] a = new int[n][26];
      int x = 0;
      for(int i = 0;i < n;i++){
        for(int j = 0;j < s[i].length();j++){
      		for(char c = 'a';c <= 'z';c++){
        		if(s[i].substring(j,j+1).equals(String.valueOf(c)))a[i][x]++;
            	x++;
        	}
            x = 0;
        }
      }
      StringBuilder ans = new StringBuilder();
      int[] min = new int[26];
      for(int i = 0;i < 26;i++)min[i]=100;
      for(int j = 0;j < 26;j++){
      	for(int i = 0;i < n;i++){
        	min[j] = Math.min(min[j],a[i][j]);
        }
      }
      int y = 0;
      for(char c = 'a';c <= 'z';c++){
        for(int i = 0;i < min[y];i++){
      		ans.append(String.valueOf(c));
        }
        y++;
      }
      System.out.println(ans.toString());
    }
}