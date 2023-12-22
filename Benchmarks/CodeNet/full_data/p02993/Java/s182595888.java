import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int input = sc.nextInt();
        //桁数
        int inputLen = String.valueOf(input).length();
        //カウント変数
        int[] count = new int[10];
        //桁ごとの数値
        String[] inputArray = String.valueOf(input).split("");
        boolean flg = false;//デフォルトはGOOD
        int beforeCountNum = 0;
        for(int i=0;i<inputArray.length;i++){
          int nowNum = Integer.parseInt(inputArray[i]);
           count[nowNum]++;
           if(count[beforeCountNum]==count[nowNum]) {
             flg =true;
           }
          count[beforeCountNum]--;
          beforeCountNum=nowNum;
        }
      	if(flg) System.out.println("Bad");
        else System.out.println("Good");
	}
}