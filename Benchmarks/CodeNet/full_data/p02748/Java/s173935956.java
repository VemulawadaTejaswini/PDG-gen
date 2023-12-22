import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
      	//配列
        int aNum[] = new int[a];
        for(int i = 0; i < a; i++){
        	aNum[i] = sc.nextInt();
        }
      	int bNum[] = new int[b];
        for(int i = 0; i < b; i++){
        	bNum[i] = sc.nextInt();
        }
      	int mNum[] = new int[m*3];
        for(int i = 0; i < m*3; i++){
        	mNum[i] = sc.nextInt();
        }
     	//クーポン未使用最安値
      	int ans =0;
      	//冷蔵庫
      	int aMin =aNum[0];
      	for(int i = 1 ; i < a; i++){
        if(aMin > aNum[i]){
            aMin = aNum[i];
    		}
        }
         //レンジ
         int bMin =bNum[0];
      	 for(int i = 1 ; i < a; i++){
         if(bMin > bNum[i]){
            bMin = bNum[i];
    		}
         }    
      	ans = aMin+bMin;
      	//クーポン使用最安値
      	int Coup =0;
      	for(int i = 0; i < m; i+=3){
          Coup = aNum[mNum[i]-1]+bNum[mNum[i+1]-1]-mNum[mNum[i+2]];
            if(ans > Coup){
            ans = Coup;
    		}
        }
      System.out.println(ans);
    }
}