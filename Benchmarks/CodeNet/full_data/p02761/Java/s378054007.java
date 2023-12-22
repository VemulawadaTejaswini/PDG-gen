import java.util.*;

class Main{
	public static void main(String[] args){
      int ret = 0;
      int pen = 0;
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      //回答用配列作成
      int[] ans = new int[n];
      int[] count = new int[n];
      for(int j = 0;j<n;j++){
        ans[j] = 0;
        count[j] = 0;
      }
      //条件適用
      for(int i=0;i<m;i++){
        int place = scn.nextInt()-1;
        int now = scn.nextInt();
        if(count[place] > 0 && ans[place] != now){
          pen = -1;
        }
      	ans[place] = now;
        count[place] = count[place]+1;
      }
      //returnの数字を出す
      for(int l = 0;l<n;l++){
        int waru = 1;
        for(int x = 0;x <l;x++){
          waru*=10;
        }
        ret += ans[l]*100/waru;
      }
      ///ペナルティを出す
      if(ans[0] == 0){
        pen = -1;
      }
	  if(pen == -1){
        System.out.println(pen);
        return;
      }
      System.out.println(ret);
    }
}