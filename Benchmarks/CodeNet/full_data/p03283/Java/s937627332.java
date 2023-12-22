import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int m=sc.nextInt();
      int q=sc.nextInt();
      int [][] ms=new int[m][2];
      int [][] ss=new int[n][n];
      for(int i=0;i<m;i++){
      	int p=sc.nextInt();
        int o=sc.nextInt();
        for(int j=0;j<p;j++){
        	for(int k=o-1;k<=n-1;k++)ss[j][k]++;
        }
      }
      for(int i=0;i<q;i++){
      	int p=sc.nextInt();
        int o=sc.nextInt();
        System.out.println(ss[p-1][o-1]);
      }
    }
}