import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
      int leng=line.length();
      int ans=Integer.parseInt(line);
      for(int i=0;i<leng-2;i++){
      	String s=line.substring(i,i+3);
        ans=Math.min(ans,Math.max(753-Integer.parseInt(s),Integer.parseInt(s)-753));
      }
        System.out.println(ans);
    }
}
