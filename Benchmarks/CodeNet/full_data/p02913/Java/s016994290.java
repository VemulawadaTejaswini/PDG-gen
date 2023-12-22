import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/2;
        int amari = (n % 2 == 0) ? 0 : 1;
        String s = sc.next();

        for(int i = 0; i < n/2; i++) {
        	for(int j = 0; j <= i+amari; j++) {
        		//System.out.println(s.substring(h+j,n) + " " + s.substring(j, j+h));
        		int l = bmSearch(s.substring(h+j,n),s.substring(j, j+h));
        		if( l == -1){

        	 		} else {
        	 		   System.out.println(l);
        	 		   return;
        	 	}
        	}
        	h--;
        }
        System.out.println(0);
        return;
    }

    private static int bmSearch(String text, String pattern){
		  // char型であらわされるあらゆる文字について
		  // 「その文字で不一致が生じた時の比較点の移動量」を
		  // あらかじめ計算してキャッシュするテーブル
		  int[] cacheTable = new int[256];

		  // 不一致が生じた移動量をあらかじめ計算し、キャッシュする
		  for(int i = 0; i < 256; i++){
		   // パターンに含まれないすべての文字は、
		   // パターン長だけ移動すればよい
		   cacheTable[i] = pattern.length();
		  }
		  for(int i = 0; i < pattern.length(); i++){
		   // パターンに含まれている文字は、それにあわせてずらす
		   // 同じ文字が複数ふくまれている場合は、
		   // 最後に登場する文字に合わせる
		   cacheTable[pattern.charAt(i)] = pattern.length() - i -1;
		  }
		  // 移動量のキャッシュここまで

		  int textIndex = pattern.length() - 1;
		  while(textIndex < text.length()) {
		   //System.err.print("　　本文:" + text + "\nパターン:");
		   for(int i=0; i < textIndex - pattern.length() + 1; ++i){
		    //System.err.print(" ");
		   }
		   //System.err.println(pattern);

		   // パターンの後ろから比較を始める
		   int patternIndex = pattern.length() - 1;

		   while(text.charAt(textIndex) == pattern.charAt(patternIndex)) {
		    if(patternIndex == 0){
		     // パターンの先頭文字まですべて比較成功すればOK
		     return pattern.length();
		    }
		    --textIndex;
		    --patternIndex;
		   }

		   if(cacheTable[text.charAt(textIndex)] > pattern.length() - patternIndex){
		    // その文字に応じて、比較点を移動
		    textIndex += cacheTable[text.charAt(textIndex)];
		   } else {
		    textIndex += pattern.length() - patternIndex;
		   }
		  }

		  // 結局一致しなかった
		  return -1;
		 }

}