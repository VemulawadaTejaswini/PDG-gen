    import java.util.Scanner;
    import java.util.ArrayList;
    import java.util.Collections;
	import java.util.Arrays;
     
    public class Main { //クラス名はMain
        public static void main(String[] args) {
            //コード
          Scanner sc = new Scanner(System.in);
          int mojilen = sc.nextInt();
          String cw2 = sc.nextLine();  //改行文字空打ち
          String c2 = sc.nextLine();
		  String[] strArray = c2.split(" ");  
          int k = 0;	//カウンタ
          //文字列リテラル　→　整数変換
          int[] x = new int[strArray.length];
    		for (int i = 0; i < strArray.length; i++) {
        	x[i] = Integer.parseInt(strArray[i]);
    		}
          Arrays.sort(x);
          int a = 0;
          int b = 0;
          int c = 0;
          //判定
          loop: for(int i=0;i<=mojilen-3;i++) {
            a = x[i];
            b = x[i+1];
            c = x[i+2];            
           		if ((a<b+c) && (b<c+a) &&(c<a+b)) {
                	//満たすとき
                  k++;
           		 }
          	else {
              		//満たさないとき
            	
            }
          }
          System.out.println(k);
        }
    }