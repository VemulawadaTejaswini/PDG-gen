import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int L =sc.nextInt();
      
     
      int at[] =new int[N];//りんごの味（L+i-1）
      int pt[] =new int[N];//りんごの味の総和からatをひいた味
      int tt =0;//りんごの味の総和
      //りんごの味の総和を求めている
      for(int i=0; i<N; i++){
        at[i] =L+i;
        tt +=at[i];
      }
	//りんごの味の総和からatをひいた味
      for(int i=0; i<N; i++){
        pt[i] =tt-at[i];
      }
      //全てのりんごN個を使ってできる味とN-1個を使ってできる味の差の初期値
      int diff = 0;
      //求める答え
      int ans =0;
        //差が最小となるところを探す
      for(int i=0; i<N; i++){
        int d0 =Math.abs(tt-pt[i]);
        if(i == 0 || diff>d0){
         	diff =d0;//最小の値を更新していく
         	ans=pt[i];
        }
        
      }
      System.out.println(ans);
    }
}