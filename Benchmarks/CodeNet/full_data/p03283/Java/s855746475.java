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
      for(int i=0;i<m;i++){
      	int p=sc.nextInt();
        int o=sc.nextInt();
        ms[i][0]=p;
        ms[i][1]=o;
      }
      for(int i=0;i<q;i++){
      	int p=sc.nextInt();
        int o=sc.nextInt();
        int f=0;
        for(int j=0;j<m;j++){
        	if(ms[j][0]>=p&&ms[j][1]<=o)f++;
        }
        System.out.println(f);
      }
    }
}